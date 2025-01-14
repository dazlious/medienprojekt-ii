package de.beuth_hochschule.Schabuu.util;

public enum PreferenceEnum {
    PREF_FPS_KEY("prefFPS"),
    PREF_URI_KEY("prefURI"),
    PREF_RESOLUTION_KEY("prefResolution"),
    PREF_BITRATE_KEY("prefBitrate"),
    PREF_CODE_KEY("prefStreamingCode"),
    PREF_AUTH_USER_KEY("prefAuthUser"),
    PREF_AUTH_PASS_KEY("prefAuthPass"),
    PREF_ABC_MODE("prefABCMode");

    private final String value;

    private PreferenceEnum(String v) {
        value = v;
    }

    public String getValue() {
        return value;
    }

    public boolean equalsValue(String eq) {
        return value.equals(eq);
    }

}
