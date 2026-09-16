package p000;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: renamed from: ۥٌؚٖؔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0893 extends AbstractC4958 implements Iterator, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ int f3237;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0893(C3598 c3598, int i) {
        super(c3598);
        this.f3237 = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3237;
        Serializable serializable = this.f16401;
        switch (i) {
            case 0:
                m8335();
                int i2 = this.f16403;
                C3598 c3598 = (C3598) serializable;
                if (i2 >= c3598.f11971) {
                    C0178.m381();
                    return null;
                }
                this.f16403 = i2 + 1;
                this.f16402 = i2;
                C0497 c0497 = new C0497(c3598, i2);
                m8336();
                return c0497;
            case 1:
                m8335();
                int i3 = this.f16403;
                C3598 c3599 = (C3598) serializable;
                if (i3 >= c3599.f11971) {
                    C0178.m381();
                    return null;
                }
                this.f16403 = i3 + 1;
                this.f16402 = i3;
                Object obj = c3599.f11978[i3];
                m8336();
                return obj;
            default:
                m8335();
                int i4 = this.f16403;
                C3598 c35910 = (C3598) serializable;
                if (i4 >= c35910.f11971) {
                    C0178.m381();
                    return null;
                }
                this.f16403 = i4 + 1;
                this.f16402 = i4;
                Object obj2 = c35910.f11977[i4];
                m8336();
                return obj2;
        }
    }
}
