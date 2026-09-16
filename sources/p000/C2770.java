package p000;

/* JADX INFO: renamed from: ۥۥۣٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2770 extends C0480 {

    /* JADX INFO: renamed from: ۦۨ */
    public final String f9189;

    public C2770(String str, String str2) {
        this(str.concat((str2 == null || AbstractC0684.m1534(str2)) ? "" : "\n".concat(str2)));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f9189;
    }

    public C2770(String str) {
        super(str);
        this.f9189 = str;
    }
}
