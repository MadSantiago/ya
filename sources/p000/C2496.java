package p000;

import java.text.CharacterIterator;

/* JADX INFO: renamed from: ۥٌ۠ؓؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2496 implements CharacterIterator {

    /* JADX INFO: renamed from: ۥْ */
    public int f8300 = 0;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f8301;

    /* JADX INFO: renamed from: ۦۨ */
    public final CharSequence f8302;

    public C2496(int i, CharSequence charSequence) {
        this.f8302 = charSequence;
        this.f8301 = i;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i = this.f8300;
        if (i == this.f8301) {
            return (char) 65535;
        }
        return this.f8302.charAt(i);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f8300 = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f8301;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f8300;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i = this.f8301;
        if (i == 0) {
            this.f8300 = i;
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f8300 = i2;
        return this.f8302.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i = this.f8300 + 1;
        this.f8300 = i;
        int i2 = this.f8301;
        if (i < i2) {
            return this.f8302.charAt(i);
        }
        this.f8300 = i2;
        return (char) 65535;
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i = this.f8300;
        if (i <= 0) {
            return (char) 65535;
        }
        int i2 = i - 1;
        this.f8300 = i2;
        return this.f8302.charAt(i2);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i) {
        if (i > this.f8301 || i < 0) {
            C1078.m2272("invalid position");
            return (char) 0;
        }
        this.f8300 = i;
        return current();
    }
}
