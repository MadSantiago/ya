package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ۥٜۜؖۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2398 {

    /* JADX INFO: renamed from: ۥؗ */
    public final float f7971;

    /* JADX INFO: renamed from: ۥُ */
    public final float f7972;

    /* JADX INFO: renamed from: ۥّ */
    public final long f7973;

    /* JADX INFO: renamed from: ۥۗ */
    public final float f7974;

    /* JADX INFO: renamed from: ۥۜ */
    public final boolean f7975;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f7976;

    /* JADX INFO: renamed from: ۦؑ */
    public final float f7977;

    /* JADX INFO: renamed from: ۦِ */
    public final C3005 f7978;

    /* JADX INFO: renamed from: ۦٛ */
    public final ArrayList f7979;

    /* JADX INFO: renamed from: ۦۗ */
    public boolean f7980;

    /* JADX INFO: renamed from: ۦۙ */
    public final int f7981;

    public C2398(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        str = (i2 & 1) != 0 ? "" : str;
        long j2 = (i2 & 32) != 0 ? C1327.f4591 : j;
        int i3 = (i2 & 64) != 0 ? 5 : i;
        this.f7976 = str;
        this.f7974 = f;
        this.f7971 = f2;
        this.f7977 = f3;
        this.f7972 = f4;
        this.f7973 = j2;
        this.f7981 = i3;
        this.f7975 = z;
        ArrayList arrayList = new ArrayList();
        this.f7979 = arrayList;
        C3005 c3005 = new C3005(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f7978 = c3005;
        arrayList.add(c3005);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m4516(C2398 c2398, ArrayList arrayList, C0547 c0547) {
        if (c2398.f7980) {
            AbstractC3480.m6278("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList2 = c2398.f7979;
        ((C3005) arrayList2.get(arrayList2.size() - 1)).f10111.add(new C2005("", arrayList, 0, c0547, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final C3963 m4517() {
        if (this.f7980) {
            AbstractC3480.m6278("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f7979;
            if (arrayList.size() <= 1) {
                C3005 c3005 = this.f7978;
                C3963 c3963 = new C3963(this.f7976, this.f7974, this.f7971, this.f7977, this.f7972, new C2715(c3005.f10109, c3005.f10107, c3005.f10104, c3005.f10110, c3005.f10105, c3005.f10106, c3005.f10113, c3005.f10108, c3005.f10112, c3005.f10111), this.f7973, this.f7981, this.f7975);
                this.f7980 = true;
                return c3963;
            }
            if (this.f7980) {
                AbstractC3480.m6278("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C3005 c3006 = (C3005) arrayList.remove(arrayList.size() - 1);
            ((C3005) arrayList.get(arrayList.size() - 1)).f10111.add(new C2715(c3006.f10109, c3006.f10107, c3006.f10104, c3006.f10110, c3006.f10105, c3006.f10106, c3006.f10113, c3006.f10108, c3006.f10112, c3006.f10111));
        }
    }
}
