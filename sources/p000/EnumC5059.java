package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦۘؗٗۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC5059 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ EnumC5059[] f16792;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC5059 f16793;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC5059 EF0;

    static {
        EnumC5059 enumC5059 = new EnumC5059("NONE", 0);
        EnumC5059 enumC50510 = new EnumC5059("START", 1);
        EnumC5059 enumC50511 = new EnumC5059("END", 2);
        EnumC5059 enumC50512 = new EnumC5059("BOTH", 3);
        f16793 = enumC50512;
        f16792 = new EnumC5059[]{enumC5059, enumC50510, enumC50511, enumC50512};
    }

    public static EnumC5059 valueOf(String str) {
        return (EnumC5059) Enum.valueOf(EnumC5059.class, str);
    }

    public static EnumC5059[] values() {
        return (EnumC5059[]) f16792.clone();
    }
}
