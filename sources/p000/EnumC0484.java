package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥؚؕؗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0484 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC0484 f1760;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC0484[] f1761;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC0484 f1762;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC0484 f1763;

    static {
        EnumC0484 enumC0484 = new EnumC0484("START", 0);
        f1763 = enumC0484;
        EnumC0484 enumC0485 = new EnumC0484("STOP", 1);
        f1762 = enumC0485;
        EnumC0484 enumC0486 = new EnumC0484("STOP_AND_RESET_REPLAY_CACHE", 2);
        f1760 = enumC0486;
        f1761 = new EnumC0484[]{enumC0484, enumC0485, enumC0486};
    }

    public static EnumC0484 valueOf(String str) {
        return (EnumC0484) Enum.valueOf(EnumC0484.class, str);
    }

    public static EnumC0484[] values() {
        return (EnumC0484[]) f1761.clone();
    }
}
