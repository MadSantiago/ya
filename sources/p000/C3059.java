package p000;

/* JADX INFO: renamed from: ۦٟؑؗ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3059 {

    /* JADX INFO: renamed from: ۥؗ */
    public final boolean f10293;

    /* JADX INFO: renamed from: ۥۗ */
    public final InterfaceC5731 f10294;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f10295;

    public C3059(String str, InterfaceC5731 interfaceC5731) {
        this.f10295 = str;
        this.f10294 = interfaceC5731;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f10295;
    }

    public /* synthetic */ C3059(String str) {
        this(str, C5302.f17465);
    }

    public C3059(int i, String str) {
        this(str);
        this.f10293 = true;
    }

    public C3059(String str, boolean z, InterfaceC5731 interfaceC5731) {
        this(str, interfaceC5731);
        this.f10293 = z;
    }
}
