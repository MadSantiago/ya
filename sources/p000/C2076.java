package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۥَۖؗؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2076 extends AbstractC1778 {

    /* JADX INFO: renamed from: ۥۗ */
    public final byte[] f6855;

    /* JADX INFO: renamed from: ۥۣ */
    public final String f6856;

    public C2076(String str, byte[] bArr) {
        this.f6856 = str;
        this.f6855 = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1778)) {
            return false;
        }
        AbstractC1778 abstractC1778 = (AbstractC1778) obj;
        C2076 c2076 = (C2076) abstractC1778;
        if (this.f6856.equals(c2076.f6856)) {
            return Arrays.equals(this.f6855, abstractC1778 instanceof C2076 ? ((C2076) abstractC1778).f6855 : c2076.f6855);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6855) ^ ((this.f6856.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "File{filename=" + this.f6856 + ", contents=" + Arrays.toString(this.f6855) + "}";
    }
}
