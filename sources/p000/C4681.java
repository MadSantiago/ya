package p000;

import java.io.Serializable;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۦِٜؓۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4681 extends AbstractC0015 implements InterfaceC3387, RandomAccess, Serializable {

    /* JADX INFO: renamed from: ۦۨ */
    public final Enum[] f15420;

    public C4681(Enum[] enumArr) {
        this.f15420 = enumArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0015  */
    @Override // p000.AbstractC0096, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.f15420;
            if (iOrdinal < enumArr.length) {
                r2 = enumArr[iOrdinal];
            } else {
                r2 = null;
            }
        } else {
            r2 = null;
        }
        return r2 == r3;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f15420;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        C1078.m2279(AbstractC5078.m8679("index: ", i, length, ", size: "));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    @Override // p000.AbstractC0015, java.util.List
    public final int indexOf(Object obj) {
        Enum r3;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.f15420;
            if (iOrdinal < enumArr.length) {
                r3 = enumArr[iOrdinal];
            } else {
                r3 = null;
            }
        } else {
            r3 = null;
        }
        if (r3 == r4) {
            return iOrdinal;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0016  */
    @Override // p000.AbstractC0015, java.util.List
    public final int lastIndexOf(Object obj) {
        Enum r3;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.f15420;
            if (iOrdinal < enumArr.length) {
                r3 = enumArr[iOrdinal];
            } else {
                r3 = null;
            }
        } else {
            r3 = null;
        }
        if (r3 == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // p000.AbstractC0096
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo624() {
        return this.f15420.length;
    }
}
