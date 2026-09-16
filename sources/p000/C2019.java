package p000;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥٟؖٔٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public class C2019 extends AbstractC0006 {

    /* JADX INFO: renamed from: ۥۨ */
    public C3536 f6658;

    /* JADX INFO: renamed from: ۦ۠ */
    public C3410 f6659;

    @Override // p000.AbstractC0006
    /* JADX INFO: renamed from: ۥٔؗۢؐ */
    public final boolean mo9751(KeyEvent keyEvent) {
        return false;
    }

    @Override // p000.InterfaceC5119
    /* JADX INFO: renamed from: ۥۙ */
    public final void mo1265(C3510 c3510, EnumC3834 enumC3834) {
        ArrayList arrayList = (ArrayList) c3510.f11621;
        m9749();
        if (this.f1335 && this.f1340 == null) {
            C4774 c4774 = new C4774(this);
            m5603(c4774);
            this.f1340 = c4774;
        }
        if (enumC3834 != EnumC3834.f12724) {
            if (enumC3834 != EnumC3834.f12722 || this.f6659 == null) {
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C3410 c3410 = (C3410) arrayList.get(i);
                if (c3410.f11353 && c3410 != this.f6659) {
                    m9798(true);
                    return;
                }
            }
            return;
        }
        if (this.f6659 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (AbstractC0487.m1060((C3410) arrayList.get(i2))) {
                    C3410 c3411 = (C3410) arrayList.get(0);
                    c3411.f11353 = true;
                    this.f6659 = c3411;
                    if (this.f1335) {
                        m9753(c3411);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C3410 c3412 = (C3410) arrayList.get(i3);
            if (c3412.f11353 || !c3412.f11350 || c3412.f11352) {
                float fMo3257 = ((InterfaceC2509) AbstractC2552.m4807(this, AbstractC2853.f9541)).mo3257();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    C3410 c3413 = (C3410) arrayList.get(i4);
                    boolean z = Math.abs(C1553.m3303(C1553.m3308(c3413.f11346, this.f6659.f11346))) > fMo3257;
                    if (c3413.f11353 || z) {
                        m9798(true);
                        return;
                    }
                }
                return;
            }
        }
        ((C3410) arrayList.get(0)).f11353 = true;
        if (this.f1335) {
            m792(this.f6659.f11346, true);
            this.f1337.mo449();
        }
        this.f6659 = null;
    }

    /* JADX INFO: renamed from: ۥؙۙؒٗ, reason: contains not printable characters */
    public final void m9798(boolean z) {
        if (z) {
            this.f6659 = null;
        } else {
            this.f6658 = null;
        }
        m791(z);
    }

    @Override // p000.InterfaceC5119
    /* JADX INFO: renamed from: ۥۧ */
    public final void mo1266() {
        m9798(true);
    }

    @Override // p000.AbstractC0006, p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؓ */
    public final void mo783() {
        super.mo783();
        m9798(false);
    }

    @Override // p000.AbstractC0006, p000.InterfaceC2766
    /* JADX INFO: renamed from: ۦؗ */
    public final void mo785(C5639 c5639, EnumC3834 enumC3834, long j) {
        super.mo785(c5639, enumC3834, j);
        if (enumC3834 != EnumC3834.f12724) {
            if (enumC3834 != EnumC3834.f12722 || this.f6658 == null) {
                return;
            }
            List list = c5639.f18583;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C3536 c3536 = (C3536) list.get(i);
                if (c3536.m6326() && c3536 != this.f6658) {
                    m9798(false);
                    return;
                }
            }
            return;
        }
        if (this.f6658 == null) {
            if (AbstractC3257.m6006(c5639, true)) {
                C3536 c3537 = (C3536) c5639.f18583.get(0);
                c3537.m6327();
                this.f6658 = c3537;
                if (this.f1335) {
                    m9750(c3537);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = c5639.f18583;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!AbstractC3801.m6796((C3536) list2.get(i2))) {
                long jM782 = m782(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    C3536 c3538 = (C3536) list2.get(i3);
                    if (c3538.m6326() || AbstractC3801.m6787(c3538, j, jM782)) {
                        m9798(false);
                        return;
                    }
                }
                return;
            }
        }
        ((C3536) list2.get(0)).m6327();
        if (this.f1335) {
            m792(this.f6658.f11726, false);
            this.f1337.mo449();
        }
        this.f6658 = null;
    }

    @Override // p000.AbstractC0006
    /* JADX INFO: renamed from: ۦۡؔ۟ؓ */
    public final void mo9752(KeyEvent keyEvent) {
        this.f1337.mo449();
    }
}
