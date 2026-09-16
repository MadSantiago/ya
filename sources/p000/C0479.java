package p000;

/* JADX INFO: renamed from: ۥٟؕؖ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0479 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f1744;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f1745;

    /* JADX INFO: renamed from: ۥۣ */
    public final Object f1746;

    public C0479(Object obj, Object obj2, Object obj3) {
        this.f1746 = obj;
        this.f1745 = obj2;
        this.f1744 = obj3;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final IllegalArgumentException m1027() {
        Object obj = this.f1746;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f1745);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f1744);
        StringBuilder sb = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
