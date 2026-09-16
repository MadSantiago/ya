package p000;

/* JADX INFO: renamed from: ۥٍُ۟ؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC2445 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final /* synthetic */ int[] f8145;

    static {
        int[] iArr = new int[EnumC1924.values().length];
        try {
            iArr[EnumC1924.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC1924.ON_START.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC1924.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC1924.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EnumC1924.ON_PAUSE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[EnumC1924.ON_RESUME.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[EnumC1924.ON_ANY.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f8145 = iArr;
    }
}
