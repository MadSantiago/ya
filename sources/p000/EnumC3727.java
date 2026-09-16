package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦٌؕؐؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3727 {

    /* JADX INFO: renamed from: ۥْ */
    public static final /* synthetic */ EnumC3727[] f12411;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC3727 f12412;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC3727 f12413;

    static {
        EnumC3727 enumC3727 = new EnumC3727("CONSENT", 0);
        f12413 = enumC3727;
        EnumC3727 enumC3728 = new EnumC3727("LEGITIMATE_INTEREST", 1);
        EnumC3727 enumC3729 = new EnumC3727("FLEXIBLE_CONSENT", 2);
        EnumC3727 enumC37210 = new EnumC3727("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        f12412 = enumC37210;
        f12411 = new EnumC3727[]{enumC3727, enumC3728, enumC3729, enumC37210};
    }

    public static EnumC3727[] values() {
        return (EnumC3727[]) f12411.clone();
    }
}
