package p000;

/* JADX INFO: renamed from: ۦَؙؕؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3849 extends RuntimeException {

    /* JADX INFO: renamed from: ۦۨ */
    public final int f12867;

    public C3849(int i, String str, C1717 c1717) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + str.length());
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(i);
        }
        super(strValueOf, c1717);
        this.f12867 = i;
    }
}
