package de.rub;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class UniPlanerGUI extends JFrame {

    public JPanel contentPane;
    private final JList<Veranstaltung> liste;
    private final JButton hinzufügenButton;
    private final JButton entfernenButton;
    private final JButton stundenplanAnzeigenButton;
    private final JTextField nameTextField;
    private final JComboBox<String> wochentagComboBox;
    private final JTextField uhrzeitTextField;
    private final JSpinner dauerSpinner;
    private final JTextField raumTextField;
    private final JRadioButton übungRadioButton;
    private final JRadioButton vorlesungRadioButton;
    private final JTextArea notizenEditorPane;

    private Veranstaltung veranstaltung = new Veranstaltung();
    private final DefaultListModel<Veranstaltung> lm;

    public UniPlanerGUI() {

        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("UniPlaner");

        JSplitPane splitPane = new JSplitPane();
        setContentPane(splitPane);

        //Set up left pane
        JPanel panelLinks = new JPanel(new BorderLayout());
        splitPane.setLeftComponent(panelLinks);

        splitPane.setDividerLocation(200);

        liste = new JList<>();
        panelLinks.add(liste, BorderLayout.CENTER);
        lm = new DefaultListModel<>();
        liste.setModel(lm);
        lm.addElement(veranstaltung);
        liste.setSelectedIndex(0);
        liste.addListSelectionListener(e -> {
            setVeranstaltung(liste.getSelectedValue());
        });

        JPanel buttonPanel = new JPanel(new GridBagLayout());
        panelLinks.add(buttonPanel, BorderLayout.SOUTH);

        hinzufügenButton = new JButton("Hinzufügen");
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5,5,5,5);
        c.weightx = 0.5;
        c.gridx = 0; c.gridy = 0; c.fill = GridBagConstraints.HORIZONTAL;
        buttonPanel.add(hinzufügenButton, c);

        hinzufügenButton.addActionListener(e -> {
            lm.addElement(new Veranstaltung());
        });

        entfernenButton = new JButton("Entfernen");
        c.gridx = 1; c.gridy = 0; c.fill = GridBagConstraints.HORIZONTAL;
        buttonPanel.add(entfernenButton, c);

        entfernenButton.addActionListener(e -> {
            int index = liste.getSelectedIndex();
            liste.setSelectedIndex(index-1);
            lm.remove(index);
        });

        stundenplanAnzeigenButton = new JButton("Stundenplan anzeigen");
        c.gridx = 0; c.gridy = 1; c.fill = GridBagConstraints.HORIZONTAL;
        c.gridwidth = 2;
        buttonPanel.add(stundenplanAnzeigenButton, c);

        // Set up right pane

        JPanel panelRechts = new JPanel(new GridBagLayout());
        splitPane.setRightComponent(panelRechts);

        c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(5,10,5,10);
        c.gridx = 0; c.gridy = 0;
        panelRechts.add(new JLabel("Name"), c);

        c.gridx = 0; c.gridy = 1;
        panelRechts.add(new JLabel("Wochentag"), c);

        c.gridx = 0; c.gridy = 2;
        panelRechts.add(new JLabel("Uhrzeit"), c);

        c.gridx = 0; c.gridy = 3;
        panelRechts.add(new JLabel("Raum"), c);

        c.gridx = 0; c.gridy = 4;
        panelRechts.add(new JLabel("Typ"), c);

        c.gridx = 0; c.gridy = 5;
        panelRechts.add(new JLabel("Notizen"), c);

        nameTextField = new JTextField();
        c.gridx = 1; c.gridy = 0;
        c.gridwidth = 3;
        c.weightx = 1;
        panelRechts.add(nameTextField, c);

        wochentagComboBox = new JComboBox<>();
        c.gridx = 1; c.gridy = 1;
        c.gridwidth = 3;
        c.weightx = 1;
        panelRechts.add(wochentagComboBox, c);

        wochentagComboBox.addItem("Montag");
        wochentagComboBox.addItem("Dienstag");
        wochentagComboBox.addItem("Mittwoch");
        wochentagComboBox.addItem("Donnerstag");
        wochentagComboBox.addItem("Freitag");
        wochentagComboBox.setSelectedIndex(0);


        uhrzeitTextField = new JTextField();
        c.gridx = 1; c.gridy = 2;
        c.gridwidth = 1;
        c.weightx = 0.5;
        panelRechts.add(uhrzeitTextField, c);


        c.gridx = 2; c.gridy = 2;
        c.weightx = 0;
        panelRechts.add(new JLabel("Dauer"), c);

        dauerSpinner = new JSpinner();
        c.gridx = 3; c.gridy = 2;
        c.weightx = 0.5;
        panelRechts.add(dauerSpinner, c);
        dauerSpinner.setModel(new SpinnerNumberModel(120, 0, 3600, 15));

        raumTextField = new JTextField();
        c.gridx = 1; c.gridy = 3;
        c.gridwidth = 3;
        c.weightx = 1;
        panelRechts.add(raumTextField, c);

        FlowLayout f = new FlowLayout();
        f.setAlignment(FlowLayout.LEFT);
        JPanel radioButtonPanel = new JPanel(f);
        c.gridx = 1; c.gridy = 4;
        c.gridwidth = 3;
        c.weightx = 1;
        panelRechts.add(radioButtonPanel, c);

        vorlesungRadioButton = new JRadioButton("Vorlesung");
        vorlesungRadioButton.setSelected(true);
        übungRadioButton = new JRadioButton("Übung");
        radioButtonPanel.add(vorlesungRadioButton);
        radioButtonPanel.add(übungRadioButton);


        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(vorlesungRadioButton);
        radioButtonGroup.add(übungRadioButton);

        notizenEditorPane = new JTextArea();
        c.gridx = 0; c.gridy = 6;
        c.gridwidth = 4;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        panelRechts.add(notizenEditorPane, c);
        notizenEditorPane.setBorder(BorderFactory.createBevelBorder(1));

        setVeranstaltung(veranstaltung);

        setListeners();
    }

    private void setListeners() {
        nameTextField.getDocument().addDocumentListener(new VeranstaltungDocumentListener());
        wochentagComboBox.addActionListener(e -> updateVeranstaltung());
        uhrzeitTextField.getDocument().addDocumentListener(new VeranstaltungDocumentListener());
        dauerSpinner.addChangeListener(e -> updateVeranstaltung());
        raumTextField.getDocument().addDocumentListener(new VeranstaltungDocumentListener());
        notizenEditorPane.getDocument().addDocumentListener(new VeranstaltungDocumentListener());
        vorlesungRadioButton.addActionListener(e -> updateVeranstaltung());
        übungRadioButton.addActionListener(e -> updateVeranstaltung());
    }

    private void updateVeranstaltung() {
        if(veranstaltung != null) {
            veranstaltung.setName(nameTextField.getText());
            veranstaltung.setUhrzeit(uhrzeitTextField.getText());
            veranstaltung.setWochentag(wochentagComboBox.getSelectedItem().toString());
            veranstaltung.setDauer((int) (dauerSpinner.getModel().getValue()));
            veranstaltung.setRaum(raumTextField.getText());
            veranstaltung.setNotizen(notizenEditorPane.getText());
            veranstaltung.setTyp(vorlesungRadioButton.isSelected() ? Veranstaltung.TYP.VORLESUNG : Veranstaltung.TYP.UEBUNG);

            liste.updateUI();
        }
    }

    public void setVeranstaltung(Veranstaltung veranstaltung) {
        if(veranstaltung != null) {
            this.veranstaltung = veranstaltung;

            nameTextField.setText(veranstaltung.getName());
            uhrzeitTextField.setText(veranstaltung.getUhrzeit());
            dauerSpinner.setValue(veranstaltung.getDauer());
            raumTextField.setText(veranstaltung.getRaum());
            notizenEditorPane.setText(veranstaltung.getNotizen());
            vorlesungRadioButton.setSelected(veranstaltung.getTyp() == Veranstaltung.TYP.VORLESUNG);
            übungRadioButton.setSelected(veranstaltung.getTyp() == Veranstaltung.TYP.UEBUNG);
            wochentagComboBox.setSelectedItem(veranstaltung.getWochentag());
        }
    }

    private class VeranstaltungDocumentListener implements DocumentListener {
        @Override
        public void insertUpdate(DocumentEvent e) {
            updateVeranstaltung();
        }
        @Override
        public void removeUpdate(DocumentEvent e) {
            updateVeranstaltung();
        }
        @Override
        public void changedUpdate(DocumentEvent e) {
            updateVeranstaltung();
        }
    }
}

