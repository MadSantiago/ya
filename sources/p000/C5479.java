package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ۦۡؕۥؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5479 implements Serializable {

    /* JADX INFO: renamed from: ۥَ */
    public final C1330 f18072;

    /* JADX INFO: renamed from: ۥْ */
    public final int f18073;

    /* JADX INFO: renamed from: ۥٓ */
    public final int f18074;

    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean f18075;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f18076;

    public C5479(String str, boolean z, int i, int i2, C1330 c1330) {
        this.f18076 = str;
        this.f18075 = z;
        this.f18073 = i;
        this.f18074 = i2;
        this.f18072 = c1330;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5479)) {
            return false;
        }
        C5479 c5479 = (C5479) obj;
        return this.f18076.equals(c5479.f18076) && this.f18075 == c5479.f18075 && this.f18073 == c5479.f18073 && this.f18074 == c5479.f18074 && this.f18072.equals(c5479.f18072);
    }

    public final int hashCode() {
        return this.f18072.hashCode() + AbstractC2049.m3999(this.f18074, AbstractC2049.m3999(this.f18073, AbstractC5078.m8672(this.f18076.hashCode() * 31, 31, this.f18075), 31), 31);
    }

    public final String toString() {
        return "ChannelDataWrapper(wrapperId=" + this.f18076 + ", isSegmentsType=" + this.f18075 + ", segmentsSize=" + this.f18073 + ", segmentsIndex=" + this.f18074 + ", instance=" + this.f18072 + ")";
    }
}
