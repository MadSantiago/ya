package p000;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: ۦٚؕۘؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4562 {

    /* JADX INFO: renamed from: ۥؗ */
    public final int f15064;

    /* JADX INFO: renamed from: ۥُ */
    public final C0181 f15065;

    /* JADX INFO: renamed from: ۥّ */
    public final C4931 f15066;

    /* JADX INFO: renamed from: ۥۗ */
    public final List f15067;

    /* JADX INFO: renamed from: ۥۣ */
    public final C0834 f15068;

    /* JADX INFO: renamed from: ۦؑ */
    public final C0834 f15069;

    /* JADX INFO: renamed from: ۦۙ */
    public final boolean f15070;

    public C4562(C0834 c0834, List list, int i, C0834 c0835, C0181 c0181, C4931 c4931, boolean z) {
        this.f15068 = c0834;
        this.f15067 = list;
        this.f15064 = i;
        this.f15069 = c0835;
        this.f15065 = c0181;
        this.f15066 = c4931;
        this.f15070 = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: ۥۗ */
    public final Object m7942(C0834 c0834, AbstractC0772 abstractC0772) throws Throwable {
        C4101 c4101;
        C5284 c5284;
        Object objM8921;
        if (abstractC0772 instanceof C4101) {
            c4101 = (C4101) abstractC0772;
            int i = c4101.f13688;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4101.f13688 = i - Integer.MIN_VALUE;
            } else {
                c4101 = new C4101(this, abstractC0772);
            }
        } else {
            c4101 = new C4101(this, abstractC0772);
        }
        Object obj = c4101.f13686;
        int i2 = c4101.f13688;
        if (i2 == 0) {
            AbstractC0186.m409(obj);
            List list = this.f15067;
            int i3 = this.f15064;
            if (i3 > 0) {
                m7943(c0834, (C5284) list.get(i3 - 1));
            }
            c5284 = (C5284) list.get(i3);
            C4562 c4562 = new C4562(this.f15068, this.f15067, i3 + 1, c0834, this.f15065, this.f15066, this.f15070);
            c4101.f13685 = this;
            c4101.f13684 = c5284;
            c4101.f13688 = 1;
            objM8921 = c5284.m8921(c4562, c4101);
            EnumC2282 enumC2282 = EnumC2282.f7590;
            if (objM8921 == enumC2282) {
                return enumC2282;
            }
        } else {
            if (i2 != 1) {
                C1078.m2276("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            C5284 c5285 = c4101.f13684;
            C4562 c4563 = c4101.f13685;
            AbstractC0186.m409(obj);
            c5284 = c5285;
            this = c4563;
            objM8921 = obj;
        }
        AbstractC4586 abstractC4586 = (AbstractC4586) objM8921;
        this.m7943(abstractC4586.mo7264(), c5284);
        return abstractC4586;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m7943(C0834 c0834, C5284 c5284) {
        Context context = c0834.f2963;
        C0834 c0835 = this.f15068;
        if (context != c0835.f2963) {
            C1078.m2277(c5284, "' cannot modify the request's context.", "Interceptor '");
            return;
        }
        if (c0834.f2961 == C1397.f4785) {
            C1078.m2277(c5284, "' cannot set the request's data to null.", "Interceptor '");
            return;
        }
        if (c0834.f2953 != c0835.f2953) {
            C1078.m2277(c5284, "' cannot modify the request's target.", "Interceptor '");
        } else if (c0834.f2972 != c0835.f2972) {
            C1078.m2277(c5284, "' cannot modify the request's lifecycle.", "Interceptor '");
        } else {
            if (c0834.f2975 == c0835.f2975) {
                return;
            }
            C1078.m2277(c5284, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        }
    }
}
