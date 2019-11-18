package com.hadesdc.HubCore.settings;

import org.mineacademy.fo.settings.SimpleSettings;

public class Settings extends SimpleSettings {

    @Override
    protected int getConfigVersion() {
        return 1;
    }
/*
Config Names
 */
    public static String LEAVE_MESSAGE;
    public static String LEAVE_MESSAGE_END;
    public static String LEAVE_MESSAGE_COLOR;
    public static String DONATION_MESSAGE;
    public static String DONATION_LINK;
    public static String JOIN_MESSAGE_LINE4;
    public static String JOIN_MESSAGE_LINE1;
    public static String JOIN_MESSAGE_LINE2;
    public static String JOIN_MESSAGE_LINE3;
    public static String JOIN_MESSAGE_LINE5;
    /*
    Server Info
     */

    public static String DONATION_COLOR;
    /*
    Player Info
     */
    public static String PLAYER_WALK_SPEED;

    /*
    Load Configs
     */
    private static void init() {
        /*
        Messages
         */
        LEAVE_MESSAGE = getString("Leave.Leave_Message");
        LEAVE_MESSAGE_END = getString("Leave.Leave_Message_End");
        LEAVE_MESSAGE_COLOR = getString("Leave.Leave_Message_Color");
        DONATION_MESSAGE = getString("Donation.Main_Message");
        DONATION_LINK = getString("Donation.Link");
        DONATION_COLOR = getString("Donation.Color");
        JOIN_MESSAGE_LINE1 = getString("Join.Message.Line1");
        JOIN_MESSAGE_LINE2 = getString("Join.Message.Line2");
        JOIN_MESSAGE_LINE3 = getString("Join.Message.Line3");
        JOIN_MESSAGE_LINE4 = getString("Join.Message.Line4");
        JOIN_MESSAGE_LINE5 = getString("Join.Message.Line5");
        /*
        Effects
         */
        PLAYER_WALK_SPEED = getString("Player.Walk_Speed");
        /*
        Server info
         */

        /*
        Items
         */



    }
}
