package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦٓؕؒۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC4125 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC4125 f13739;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC4125[] f13740;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC4125 f13741;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC4125 f13742;

    static {
        EnumC4125 enumC4125 = new EnumC4125("Active", 0);
        f13742 = enumC4125;
        EnumC4125 enumC4126 = new EnumC4125("ActiveParent", 1);
        f13741 = enumC4126;
        EnumC4125 enumC4127 = new EnumC4125("Captured", 2);
        EnumC4125 enumC4128 = new EnumC4125("Inactive", 3);
        f13739 = enumC4128;
        f13740 = new EnumC4125[]{enumC4125, enumC4126, enumC4127, enumC4128};
    }

    public static EnumC4125 valueOf(String str) {
        return (EnumC4125) Enum.valueOf(EnumC4125.class, str);
    }

    public static EnumC4125[] values() {
        return (EnumC4125[]) f13740.clone();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m7315() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                C1078.m2275();
                return false;
            }
        }
        return true;
    }
}
