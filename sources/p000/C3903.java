package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦُْؔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3903 implements Iterator {

    /* JADX INFO: renamed from: ۥَ */
    public final boolean f13024;

    /* JADX INFO: renamed from: ۥْ */
    public final String f13025;

    /* JADX INFO: renamed from: ۥٓ */
    public final AbstractC0487 f13026;

    /* JADX INFO: renamed from: ۦٗ */
    public int f13028;

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ C1039 f13029;

    /* JADX INFO: renamed from: ۦ۟ */
    public String f13030;

    /* JADX INFO: renamed from: ۦۨ */
    public int f13031 = 2;

    /* JADX INFO: renamed from: ۥٖ */
    public int f13027 = 0;

    public C3903(C1039 c1039, C1829 c1829, String str) {
        this.f13029 = c1039;
        this.f13026 = (AbstractC0487) c1829.f6061;
        this.f13024 = c1829.f6063;
        this.f13028 = c1829.f6062;
        this.f13025 = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int i;
        AbstractC0487 abstractC0487;
        int i2 = this.f13031;
        if (i2 == 4) {
            throw new IllegalStateException();
        }
        int iM6632 = AbstractC3761.m6632(i2);
        if (iM6632 == 0) {
            return true;
        }
        if (iM6632 == 2) {
            return false;
        }
        this.f13031 = 4;
        int i3 = this.f13027;
        while (true) {
            int length = this.f13027;
            if (length == -1) {
                this.f13031 = 3;
                string = null;
                break;
            }
            C5335 c5335 = (C5335) this.f13029.f3672;
            String str = this.f13025;
            int length2 = str.length();
            AbstractC0949.m1963(length, length2);
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (c5335.mo1098(str.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str.length();
                this.f13027 = -1;
                i = -1;
            } else {
                i = length + 1;
                this.f13027 = i;
            }
            if (i == i3) {
                int i4 = i + 1;
                this.f13027 = i4;
                if (i4 > str.length()) {
                    this.f13027 = -1;
                }
            } else {
                while (true) {
                    abstractC0487 = this.f13026;
                    if (i3 >= length || !abstractC0487.mo1098(str.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                while (length > i3 && abstractC0487.mo1098(str.charAt(length - 1))) {
                    length--;
                }
                if (!this.f13024 || i3 != length) {
                    int i5 = this.f13028;
                    if (i5 == 1) {
                        length = str.length();
                        this.f13027 = -1;
                        while (length > i3 && abstractC0487.mo1098(str.charAt(length - 1))) {
                            length--;
                        }
                    } else {
                        this.f13028 = i5 - 1;
                    }
                    string = str.subSequence(i3, length).toString();
                    break;
                }
                i3 = this.f13027;
            }
        }
        this.f13030 = string;
        if (this.f13031 == 3) {
            return false;
        }
        this.f13031 = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0178.m381();
            return null;
        }
        this.f13031 = 2;
        String str = this.f13030;
        this.f13030 = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
