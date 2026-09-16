package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۥٍؙۙؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2206 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ EnumC2206[] f7313;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC2206 f7314;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2206 EF0;

    static {
        EnumC2206 enumC2206 = new EnumC2206("UNKNOWN", 0);
        EnumC2206 enumC2207 = new EnumC2206("ANDROID_FIREBASE", 1);
        f7314 = enumC2207;
        f7313 = new EnumC2206[]{enumC2206, enumC2207};
    }

    public static EnumC2206 valueOf(String str) {
        return (EnumC2206) Enum.valueOf(EnumC2206.class, str);
    }

    public static EnumC2206[] values() {
        return (EnumC2206[]) f7313.clone();
    }
}
