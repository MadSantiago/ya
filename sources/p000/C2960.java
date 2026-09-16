package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦؐؑۖۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2960 implements Iterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥَ */
    public Object f9920;

    /* JADX INFO: renamed from: ۥْ */
    public int f9921;

    /* JADX INFO: renamed from: ۥٓ */
    public int f9922;

    /* JADX INFO: renamed from: ۥٖ */
    public final Object f9923;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f9924;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f9925;

    public C2960(C3306 c3306) {
        this.f9925 = 0;
        this.f9923 = c3306;
        this.f9924 = -1;
        int iM7934 = AbstractC4554.m7934(0, 0, ((CharSequence) c3306.f11069).length());
        this.f9921 = iM7934;
        this.f9922 = iM7934;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f9925) {
            case 0:
                if (this.f9924 == -1) {
                    m5522();
                }
                return this.f9924 == 1;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9925) {
            case 0:
                if (this.f9924 == -1) {
                    m5522();
                }
                if (this.f9924 == 0) {
                    C0178.m381();
                    return null;
                }
                C3046 c3046 = (C3046) this.f9920;
                this.f9920 = null;
                this.f9924 = -1;
                return c3046;
            default:
                throw null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f9925) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m5522() {
        C3869 c3869;
        C3306 c3306 = (C3306) this.f9923;
        CharSequence charSequence = (CharSequence) c3306.f11069;
        int i = this.f9922;
        if (i < 0) {
            this.f9924 = 0;
            this.f9920 = null;
            return;
        }
        if (i <= charSequence.length() && (c3869 = (C3869) ((InterfaceC5731) c3306.f11068).mo219(charSequence, Integer.valueOf(this.f9922))) != null) {
            int iIntValue = ((Number) c3869.f12915).intValue();
            int iIntValue2 = ((Number) c3869.f12914).intValue();
            this.f9920 = AbstractC4554.m7917(this.f9921, iIntValue);
            int i2 = iIntValue + iIntValue2;
            this.f9921 = i2;
            this.f9922 = i2 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f9920 = new C3046(this.f9921, AbstractC0684.m1529(charSequence), 1);
            this.f9922 = -1;
        }
        this.f9924 = 1;
    }

    public C2960(C2575 c2575, int i, AbstractC5020 abstractC5020, AbstractC0186 abstractC0186) {
        this.f9925 = 1;
        this.f9920 = c2575;
        this.f9924 = i;
        this.f9923 = abstractC0186;
        this.f9921 = c2575.f8601;
    }
}
