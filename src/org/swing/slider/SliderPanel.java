package org.swing.slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Created by daidaijie on 2016/2/6.
 */
public class SliderPanel extends JPanel {

    private JPanel sliderPanel;
    private JTextField textField;
    private ChangeListener listener;

    public SliderPanel() {

        setLayout(new BorderLayout());

        sliderPanel = new JPanel();
        sliderPanel.setLayout(new GridBagLayout());

        //common listener for all sliders
        listener = new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                //update the field when the slider values changes
                JSlider source = (JSlider) e.getSource();
                textField.setText("" + source.getValue());
            }
        };

        //add a plain slider
        JSlider slider = new JSlider();
        addSlider(slider, "Plain");

        //add a slider with major and minor ticks
        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider, "Ticks");

        //add a slider that snaps to ticks
        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider, "Snap to ticks");

        //add a slider with no track
        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTrack(false);
        addSlider(slider, "No track");

        //add an inverted slider
        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setInverted(true);
        addSlider(slider, "Inverted");

        //add a slider with numeric labels
        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        addSlider(slider, "Labels");

        //add a slier with alphabetic labels
        slider = new JSlider();
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);

        Dictionary<Integer, Component> lableTable = new Hashtable<>();
        lableTable.put(0, new JLabel("A"));
        lableTable.put(20, new JLabel("B"));
        lableTable.put(40, new JLabel("C"));
        lableTable.put(60, new JLabel("D"));
        lableTable.put(80, new JLabel("E"));
        lableTable.put(100, new JLabel("F"));

        slider.setLabelTable(lableTable);
        addSlider(slider,"Custom Label");



        textField = new JTextField(10);
        add(sliderPanel, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);


    }

    /**
     * Adds a slider to the slider panel and hooks up the listener
     *
     * @param s           the slider
     * @param description the slider description
     */
    public void addSlider(JSlider s, String description) {

        s.addChangeListener(listener);
        JPanel panel = new JPanel();
        panel.add(s);
        panel.add(new JLabel(description));
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridy = sliderPanel.getComponentCount();
        gbc.anchor = GridBagConstraints.WEST;
        sliderPanel.add(panel, gbc);
    }
}
