package p000;

/* JADX INFO: renamed from: ۥْؔۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0427 extends AbstractC0028 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ int f1541 = 1;

    /* JADX INFO: renamed from: ۥٓ */
    public final Object f1542;

    public C0427(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.f1542 = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.f1541;
        Object obj = this.f1542;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    C0178.m381();
                    return null;
                }
                int i2 = this.f5661;
                this.f5661 = i2 + 1;
                return ((Object[]) obj)[i2];
            default:
                if (hasNext()) {
                    this.f5661++;
                    return obj;
                }
                C0178.m381();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.f1541;
        Object obj = this.f1542;
        switch (i) {
            case 0:
                if (!hasPrevious()) {
                    C0178.m381();
                    return null;
                }
                int i2 = this.f5661 - 1;
                this.f5661 = i2;
                return ((Object[]) obj)[i2];
            default:
                if (hasPrevious()) {
                    this.f5661--;
                    return obj;
                }
                C0178.m381();
                return null;
        }
    }

    public C0427(int i, Object obj) {
        super(i, 1);
        this.f1542 = obj;
    }
}
