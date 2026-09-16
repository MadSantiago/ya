package p000;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: ۥۣٓؒۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1262 extends C5038 {

    /* JADX INFO: renamed from: ۦ۟ */
    public boolean f4330;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5038 f4331;

    public C1262(long j, C5570 c5570, InterfaceC4745 interfaceC4745, InterfaceC4745 interfaceC4746, C5038 c5038) {
        super(j, c5570, interfaceC4745, interfaceC4746);
        this.f4331 = c5038;
        c5038.mo4470();
    }

    @Override // p000.C5038, p000.AbstractC3191
    /* JADX INFO: renamed from: ۥؗ */
    public final void mo2657() {
        if (this.f10717) {
            return;
        }
        super.mo2657();
        if (this.f4330) {
            return;
        }
        this.f4330 = true;
        this.f4331.mo4467();
    }

    @Override // p000.C5038
    /* JADX INFO: renamed from: ۥۖ */
    public final AbstractC5568 mo2658() {
        C1262 c1262;
        C5038 c5038 = this.f4331;
        if (c5038.f16715 || c5038.f10717) {
            return new C4894(this);
        }
        C3639 c3639 = this.f16713;
        long j = this.f10718;
        HashMap mapM3282 = c3639 != null ? AbstractC1538.m3282(c5038.mo5118(), this, this.f4331.mo5117()) : null;
        Object obj = AbstractC1538.f5203;
        synchronized (obj) {
            try {
                AbstractC1538.m3289(this);
                if (c3639 == null || c3639.f12176 == 0) {
                    c1262 = this;
                    c1262.m5882();
                } else {
                    c1262 = this;
                    AbstractC5568 abstractC5568M8552 = c1262.m8552(this.f4331.mo5118(), c3639, mapM3282, this.f4331.mo5117());
                    if (!abstractC5568M8552.equals(C4872.f16034)) {
                        return abstractC5568M8552;
                    }
                    C3639 c3639Mo7632 = c1262.f4331.mo7632();
                    if (c3639Mo7632 != null) {
                        c3639Mo7632.m6499(c3639);
                    } else {
                        c1262.f4331.mo7631(c3639);
                        c1262.f16713 = null;
                    }
                }
                if (AbstractC3831.m6844(c1262.f4331.mo5118(), j) < 0) {
                    c1262.f4331.m8553();
                }
                C5038 c5039 = c1262.f4331;
                c5039.mo5878(c5039.mo5117().m9400(j).m9399(c1262.f16716));
                c1262.f4331.m8551(j);
                C5038 c50310 = c1262.f4331;
                int i = c1262.f10720;
                c1262.f10720 = -1;
                if (i >= 0) {
                    int[] iArr = c50310.f16718;
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    c50310.f16718 = iArrCopyOf;
                } else {
                    c50310.getClass();
                }
                C5038 c50311 = c1262.f4331;
                C5570 c5570 = c1262.f16716;
                c50311.getClass();
                synchronized (obj) {
                    c50311.f16716 = c50311.f16716.m9398(c5570);
                    C5038 c50312 = c1262.f4331;
                    int[] iArr2 = c1262.f16718;
                    c50312.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c50312.f16718;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        c50312.f16718 = iArr2;
                    }
                }
                c1262.f16715 = true;
                if (!c1262.f4330) {
                    c1262.f4330 = true;
                    c1262.f4331.mo4467();
                }
                return C4872.f16034;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
