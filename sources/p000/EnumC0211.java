package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥٟؑؖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0211 {

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC0211 f793;

    /* JADX INFO: renamed from: ۥٓ */
    public static final /* synthetic */ EnumC0211[] f794;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC0211 f795;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC0211 f796;

    static {
        EnumC0211 enumC0211 = new EnumC0211("PreEnter", 0);
        f796 = enumC0211;
        EnumC0211 enumC0212 = new EnumC0211("Visible", 1);
        f795 = enumC0212;
        EnumC0211 enumC0213 = new EnumC0211("PostExit", 2);
        f793 = enumC0213;
        f794 = new EnumC0211[]{enumC0211, enumC0212, enumC0213};
    }

    public static EnumC0211 valueOf(String str) {
        return (EnumC0211) Enum.valueOf(EnumC0211.class, str);
    }

    public static EnumC0211[] values() {
        return (EnumC0211[]) f794.clone();
    }
}
