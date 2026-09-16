package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۦٟٛؗؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4645 extends AbstractC4822 {

    /* JADX INFO: renamed from: ۥَ */
    public static final C4645 f15320 = new C4645(0, new Object[0]);

    /* JADX INFO: renamed from: ۥْ */
    public final transient Object[] f15321;

    /* JADX INFO: renamed from: ۥٓ */
    public final transient int f15322;

    public C4645(int i, Object[] objArr) {
        this.f15321 = objArr;
        this.f15322 = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0949.m1955(i, this.f15322);
        Object obj = this.f15321[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15322;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥُ */
    public final Object[] mo3022() {
        return this.f15321;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3023() {
        return this.f15322;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۥۜ */
    public final boolean mo352() {
        return false;
    }

    @Override // p000.AbstractC4822, p000.AbstractC2857
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo1603(Object[] objArr) {
        Object[] objArr2 = this.f15321;
        int i = this.f15322;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.AbstractC2857
    /* JADX INFO: renamed from: ۦۙ */
    public final int mo3024() {
        return 0;
    }
}
