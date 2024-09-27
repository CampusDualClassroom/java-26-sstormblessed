package com.campusdual.classroom;

public class Contact {
    private String name;
    private String surnames;
    private String phone;
    private String code;

    public Contact(String name, String surnames, String phone) {
        this.name = name;
        this.surnames = surnames;
        this.phone = phone;
        this.code = generateContactCode();
    }

    private String generateContactCode() {
        StringBuilder stringBuilder = new StringBuilder();
        String primera_letra_nombre = String.valueOf(name.toLowerCase().charAt(0));
        stringBuilder.append(primera_letra_nombre);
        String[] apellidos = surnames.split(" ");
        for (int i = 0; i < apellidos.length; i++) {
            if (apellidos.length > 1) {
                if (i == 0) {
                    stringBuilder.append(apellidos[i].toLowerCase().charAt(0));
                } else {
                    stringBuilder.append(apellidos[i].toLowerCase());
                }
            } else {
                stringBuilder.append(apellidos[i].toLowerCase());
            }
        }

        return stringBuilder.toString();
    }

    public void callMyNumber() {
        System.out.println("Calling " + name + " " + surnames + " at " + phone);
    }

    public void callOtherNumber(String otherPhone) {
        System.out.println("Calling " + name + " " + surnames + " at " + otherPhone);
    }

    public void showContactDetails() {
        System.out.println("Name: " + name);
        System.out.println("Surnames: " + surnames);
        System.out.println("Phone: " + phone);
        System.out.println("Code: " + code);
    }

    public String getName() {
        return name;
    }

    public String getSurnames() {
        return surnames;
    }

    public String getPhone() {
        return phone;
    }

    public String getCode() {
        return code;
    }
}
