package p000;

/* JADX INFO: renamed from: ۥٌۨؖۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2939 extends AbstractC5848 {

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ int f9873;

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f9873) {
            case 0:
                int i = this.f19273;
                this.f19273 = i + 2;
                Object[] objArr = this.f19275;
                return new C3889(0, objArr[i], objArr[i + 1]);
            case 1:
                int i2 = this.f19273;
                this.f19273 = i2 + 2;
                return this.f19275[i2];
            default:
                int i3 = this.f19273;
                this.f19273 = i3 + 2;
                return this.f19275[i3 + 1];
        }
    }
}
