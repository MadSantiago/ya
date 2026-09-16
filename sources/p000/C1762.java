package p000;

/* JADX INFO: renamed from: ۥٛؒؕؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1762 {

    /* JADX INFO: renamed from: ۥؗ */
    public String f5867;

    /* JADX INFO: renamed from: ۥۗ */
    public int f5868;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f5869 = 1;

    public C1762(int i, String str, Object[] objArr) {
        this.f5867 = String.format(str, objArr);
        this.f5868 = i;
    }

    public String toString() {
        switch (this.f5869) {
            case 1:
                return this.f5868 + ": " + this.f5867;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C1762() {
    }

    public C1762(int i, String str) {
        this.f5868 = i;
        this.f5867 = str;
    }
}
