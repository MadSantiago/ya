package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦۘؔؔۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5019 implements Iterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥَ */
    public int f16603;

    /* JADX INFO: renamed from: ۥْ */
    public int f16604;

    /* JADX INFO: renamed from: ۥٓ */
    public int f16605;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f16606;

    /* JADX INFO: renamed from: ۦۨ */
    public final CharSequence f16607;

    public C5019(CharSequence charSequence) {
        this.f16607 = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i2;
        int i3 = this.f16606;
        if (i3 != 0) {
            return i3 == 1;
        }
        if (this.f16603 < 0) {
            this.f16606 = 2;
            return false;
        }
        CharSequence charSequence = this.f16607;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i4 = this.f16604; i4 < length2; i4++) {
            char cCharAt = charSequence.charAt(i4);
            if (cCharAt == '\n' || cCharAt == '\r') {
                i = (cCharAt == '\r' && (i2 = i4 + 1) < charSequence.length() && charSequence.charAt(i2) == '\n') ? 2 : 1;
                length = i4;
                this.f16606 = 1;
                this.f16603 = i;
                this.f16605 = length;
                return true;
            }
        }
        i = -1;
        this.f16606 = 1;
        this.f16603 = i;
        this.f16605 = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            C0178.m381();
            return null;
        }
        this.f16606 = 0;
        int i = this.f16605;
        int i2 = this.f16604;
        this.f16604 = this.f16603 + i;
        return this.f16607.subSequence(i2, i).toString();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
