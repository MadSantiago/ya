package p000;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۦۣۨؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5897 extends AbstractC4489 {

    /* JADX INFO: renamed from: ۥؔ */
    public final int f19446;

    /* JADX INFO: renamed from: ۦُ */
    public final /* synthetic */ int f19447;

    /* JADX INFO: renamed from: ۦٖ */
    public final Method f19448;

    public /* synthetic */ C5897(Method method, int i, int i2) {
        this.f19447 = i2;
        this.f19448 = method;
        this.f19446 = i;
    }

    @Override // p000.AbstractC4489
    /* JADX INFO: renamed from: ۦٛ */
    public final void mo963(C1781 c1781, Object obj) {
        int i = this.f19447;
        int i2 = this.f19446;
        Method method = this.f19448;
        switch (i) {
            case 0:
                C4714 c4714 = (C4714) obj;
                if (c4714 == null) {
                    throw AbstractC4554.m7926(method, i2, "Headers parameter must not be null.", new Object[0]);
                }
                C5086 c5086 = c1781.f5939;
                c5086.getClass();
                int size = c4714.size();
                for (int i3 = 0; i3 < size; i3++) {
                    c5086.m8690(c4714.m8049(i3), c4714.m8047(i3));
                }
                return;
            default:
                if (obj == null) {
                    throw AbstractC4554.m7926(method, i2, "@Url parameter is null.", new Object[0]);
                }
                c1781.f5937 = obj.toString();
                return;
        }
    }
}
