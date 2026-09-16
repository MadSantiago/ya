package p000;

/* JADX INFO: renamed from: ۦِؚؕؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3974 implements Comparable {

    /* JADX INFO: renamed from: ۥْ */
    public final String f13284;

    /* JADX INFO: renamed from: ۥٓ */
    public final String f13285;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f13286;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f13287;

    public C3974(String str, int i, int i2, String str2) {
        this.f13287 = i;
        this.f13286 = i2;
        this.f13284 = str;
        this.f13285 = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3974 c3974 = (C3974) obj;
        int i = this.f13287 - c3974.f13287;
        return i == 0 ? this.f13286 - c3974.f13286 : i;
    }
}
