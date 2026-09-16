package p000;

/* JADX INFO: renamed from: ۥۦؔۖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2804 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final C2637 f9358;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C2637 f9359 = new C2637();

    static {
        C5734 c5734 = C5734.f18904;
        C2637 c2637 = null;
        try {
            c2637 = (C2637) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f9358 = c2637;
    }
}
