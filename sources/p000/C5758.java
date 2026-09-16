package p000;

import java.util.Objects;

/* JADX INFO: renamed from: ۦۦؚؔؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5758 extends AbstractC1958 {

    /* JADX INFO: renamed from: ۥَ */
    public static final C5758 f18975 = new C5758(0, new Object[0]);

    /* JADX INFO: renamed from: ۥْ */
    public final transient Object[] f18976;

    /* JADX INFO: renamed from: ۥٓ */
    public final transient int f18977;

    public C5758(int i, Object[] objArr) {
        this.f18976 = objArr;
        this.f18977 = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC0487.m1055(i, this.f18977);
        Object obj = this.f18976[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18977;
    }

    @Override // p000.AbstractC4453
    /* JADX INFO: renamed from: ۥُ */
    public final int mo6541() {
        return this.f18977;
    }

    @Override // p000.AbstractC1958, p000.AbstractC4453
    /* JADX INFO: renamed from: ۥّ */
    public final int mo3838(Object[] objArr) {
        Object[] objArr2 = this.f18976;
        int i = this.f18977;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // p000.AbstractC4453
    /* JADX INFO: renamed from: ۥۗ */
    public final Object[] mo6542() {
        return this.f18976;
    }

    @Override // p000.AbstractC4453
    /* JADX INFO: renamed from: ۦؑ */
    public final int mo6543() {
        return 0;
    }
}
