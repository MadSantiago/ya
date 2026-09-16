package p000;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ۦَؖؕؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC3359 {

    /* JADX INFO: renamed from: ۥَ */
    public static final EnumC3359 f11224;

    /* JADX INFO: renamed from: ۥْ */
    public static final EnumC3359 f11225;

    /* JADX INFO: renamed from: ۥٓ */
    public static final EnumC3359 f11226;

    /* JADX INFO: renamed from: ۥٖ */
    public static final EnumC3359 f11227;

    /* JADX INFO: renamed from: ۦٗ */
    public static final /* synthetic */ EnumC3359[] f11228;

    /* JADX INFO: renamed from: ۦ۟ */
    public static final EnumC3359 f11229;

    /* JADX INFO: renamed from: ۦۨ */
    public static final EnumC3359 f11230;

    static {
        EnumC3359 enumC3359 = new EnumC3359("ShutDown", 0);
        f11230 = enumC3359;
        EnumC3359 enumC33510 = new EnumC3359("ShuttingDown", 1);
        f11229 = enumC33510;
        EnumC3359 enumC33511 = new EnumC3359("Inactive", 2);
        f11225 = enumC33511;
        EnumC3359 enumC33512 = new EnumC3359("InactivePendingWork", 3);
        f11226 = enumC33512;
        EnumC3359 enumC33513 = new EnumC3359("Idle", 4);
        f11224 = enumC33513;
        EnumC3359 enumC33514 = new EnumC3359("PendingWork", 5);
        f11227 = enumC33514;
        f11228 = new EnumC3359[]{enumC3359, enumC33510, enumC33511, enumC33512, enumC33513, enumC33514};
    }

    public static EnumC3359 valueOf(String str) {
        return (EnumC3359) Enum.valueOf(EnumC3359.class, str);
    }

    public static EnumC3359[] values() {
        return (EnumC3359[]) f11228.clone();
    }
}
