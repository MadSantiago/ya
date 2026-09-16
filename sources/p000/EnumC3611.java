package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦؚّؖۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3611 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC3611 f12027;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC3611[] f12028;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC3611 f12029;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC3611 f12030;

    static {
        EnumC3611 enumC3611 = new EnumC3611("LEFT", 0);
        f12030 = enumC3611;
        EnumC3611 enumC3612 = new EnumC3611("CENTER", 1);
        f12029 = enumC3612;
        EnumC3611 enumC3613 = new EnumC3611("RIGHT", 2);
        f12027 = enumC3613;
        f12028 = new EnumC3611[]{enumC3611, enumC3612, enumC3613};
    }

    public static EnumC3611 valueOf(String str) {
        return (EnumC3611) Enum.valueOf(EnumC3611.class, str);
    }

    public static EnumC3611[] values() {
        return (EnumC3611[]) f12028.clone();
    }
}
