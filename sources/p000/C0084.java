package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: ۦٟ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C0084 implements Iterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥْ */
    public final Object f15890;

    /* JADX INFO: renamed from: ۦ۟ */
    public int f15891;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f15892;

    public C0084(C2505 c2505) {
        this.f15892 = 3;
        this.f15890 = c2505;
        this.f15891 = c2505.f15432;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f15892;
        Object obj = this.f15890;
        switch (i) {
            case 0:
                return this.f15891 < ((AbstractC0015) obj).mo624();
            case 1:
                return this.f15891 < ((Object[]) obj).length;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return ((Iterator) obj).hasNext();
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return this.f15891 > 0;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return this.f15891 < ((byte[]) obj).length;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return this.f15891 < ((int[]) obj).length;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return this.f15891 < ((long[]) obj).length;
            default:
                return this.f15891 < ((short[]) obj).length;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f15892;
        Object obj = this.f15890;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    C0178.m381();
                    return null;
                }
                int i2 = this.f15891;
                this.f15891 = i2 + 1;
                return ((AbstractC0015) obj).get(i2);
            case 1:
                try {
                    int i3 = this.f15891;
                    this.f15891 = i3 + 1;
                    return ((Object[]) obj)[i3];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f15891--;
                    C0178.m384(e.getMessage());
                    return null;
                }
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                int i4 = this.f15891;
                this.f15891 = i4 + 1;
                if (i4 >= 0) {
                    return new C3285(i4, ((Iterator) obj).next());
                }
                AbstractC2164.m4180();
                throw null;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C2505 c2505 = (C2505) obj;
                int i5 = c2505.f15432;
                int i6 = this.f15891;
                this.f15891 = i6 - 1;
                return c2505.f15433[i5 - i6];
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                int i7 = this.f15891;
                byte[] bArr = (byte[]) obj;
                if (i7 < bArr.length) {
                    this.f15891 = i7 + 1;
                    return new C2513(bArr[i7]);
                }
                C0178.m384(String.valueOf(i7));
                return null;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                int i8 = this.f15891;
                int[] iArr = (int[]) obj;
                if (i8 < iArr.length) {
                    this.f15891 = i8 + 1;
                    return new C5706(iArr[i8]);
                }
                C0178.m384(String.valueOf(i8));
                return null;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                int i9 = this.f15891;
                long[] jArr = (long[]) obj;
                if (i9 < jArr.length) {
                    this.f15891 = i9 + 1;
                    return new C4462(jArr[i9]);
                }
                C0178.m384(String.valueOf(i9));
                return null;
            default:
                int i10 = this.f15891;
                short[] sArr = (short[]) obj;
                if (i10 < sArr.length) {
                    this.f15891 = i10 + 1;
                    return new C2866(sArr[i10]);
                }
                C0178.m384(String.valueOf(i10));
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f15892) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public /* synthetic */ C0084(int i, Object obj) {
        this.f15892 = i;
        this.f15890 = obj;
    }
}
