package p000;

/* JADX INFO: renamed from: ۥٍؚؓؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0946 {

    /* JADX INFO: renamed from: ۥؗ */
    public final String f3351;

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean f3352;

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f3353;

    public C0946(String str, boolean z) {
        this.f3353 = 1;
        this.f3352 = z;
        this.f3351 = str;
    }

    public String toString() {
        switch (this.f3353) {
            case 0:
                String str = this.f3351;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.f3352);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0946(int i, String str, boolean z) {
        this.f3353 = i;
        this.f3351 = str;
        this.f3352 = z;
    }
}
