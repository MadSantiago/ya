package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥٟۚؕۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2282 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC2282 f7587;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC2282[] f7588;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC2282 f7589;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC2282 f7590;

    static {
        EnumC2282 enumC2282 = new EnumC2282("COROUTINE_SUSPENDED", 0);
        f7590 = enumC2282;
        EnumC2282 enumC2283 = new EnumC2282("UNDECIDED", 1);
        f7589 = enumC2283;
        EnumC2282 enumC2284 = new EnumC2282("RESUMED", 2);
        f7587 = enumC2284;
        f7588 = new EnumC2282[]{enumC2282, enumC2283, enumC2284};
    }

    public static EnumC2282 valueOf(String str) {
        return (EnumC2282) Enum.valueOf(EnumC2282.class, str);
    }

    public static EnumC2282[] values() {
        return (EnumC2282[]) f7588.clone();
    }
}
