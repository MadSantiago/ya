package p000;

/* JADX INFO: renamed from: ۥٌؓؕۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0885 implements InterfaceC3120 {
    f3228("UNKNOWN"),
    f3222("SHARED_PREFS"),
    f3223("CONTENT_PROVIDER"),
    f3221("FILE"),
    f3224("TIKTOK"),
    f3226("DEVICE_CONFIG"),
    f3227("PROCESS_STABLE_CONTENT_PROVIDER");


    /* JADX INFO: renamed from: ۦۨ */
    public final int f3229;

    EnumC0885(String str) {
        this.f3229 = i;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static EnumC0885 m1879(int i) {
        switch (i) {
            case 0:
                return f3228;
            case 1:
                return f3222;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return f3223;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return f3227;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return f3224;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return f3226;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return f3221;
            default:
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f3229);
    }

    @Override // p000.InterfaceC3120
    /* JADX INFO: renamed from: ۥۣ */
    public final int mo1880() {
        return this.f3229;
    }
}
