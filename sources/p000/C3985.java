package p000;

/* JADX INFO: renamed from: ۦِؖٗۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3985 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C0863 f13308 = new C0863(new InterfaceC3569[16]);

    /* JADX INFO: renamed from: ۥۗ */
    public static final C3985 f13306 = new C3985();

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3985 f13305 = new C3985();

    /* JADX INFO: renamed from: ۦؑ */
    public static final C3985 f13307 = new C3985();

    /* JADX INFO: renamed from: ۥۣ */
    public static void m7129(C3985 c3985) {
        c3985.getClass();
        if (c3985 == f13306) {
            C1078.m2276("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        if (c3985 == f13305) {
            C1078.m2276("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return;
        }
        C0863 c0863 = c3985.f13308;
        int i = c0863.f3180;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return;
        }
        Object[] objArr = c0863.f3182;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = (InterfaceC3569) objArr[i2];
            if (!((AbstractC5381) obj).f17791.f17786) {
                AbstractC3480.m6278("visitChildren called on an unattached node");
            }
            C0863 c0864 = new C0863(new AbstractC5381[16]);
            AbstractC5381 abstractC5381 = ((AbstractC5381) obj).f17791;
            AbstractC5381 abstractC5382 = abstractC5381.f17783;
            if (abstractC5382 == null) {
                AbstractC5537.m9249(c0864, abstractC5381);
            } else {
                c0864.m1843(abstractC5382);
            }
            while (true) {
                int i3 = c0864.f3180;
                if (i3 == 0) {
                    break;
                }
                AbstractC5381 abstractC5381M9233 = (AbstractC5381) c0864.m1850(i3 - 1);
                if ((abstractC5381M9233.f17782 & 1024) == 0) {
                    AbstractC5537.m9249(c0864, abstractC5381M9233);
                } else {
                    while (abstractC5381M9233 != null) {
                        if ((abstractC5381M9233.f17781 & 1024) != 0) {
                            C0863 c0865 = null;
                            while (abstractC5381M9233 != null) {
                                if (abstractC5381M9233 instanceof C3468) {
                                    if (((C3468) abstractC5381M9233).m6255(7)) {
                                        break;
                                    }
                                } else if ((abstractC5381M9233.f17781 & 1024) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                                    int i4 = 0;
                                    for (AbstractC5381 abstractC5383 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5383 != null; abstractC5383 = abstractC5383.f17783) {
                                        if ((abstractC5383.f17781 & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                abstractC5381M9233 = abstractC5383;
                                            } else {
                                                if (c0865 == null) {
                                                    c0865 = new C0863(new AbstractC5381[16]);
                                                }
                                                if (abstractC5381M9233 != null) {
                                                    c0865.m1843(abstractC5381M9233);
                                                    abstractC5381M9233 = null;
                                                }
                                                c0865.m1843(abstractC5383);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC5381M9233 = AbstractC5537.m9233(c0865);
                            }
                            break;
                        }
                        abstractC5381M9233 = abstractC5381M9233.f17783;
                    }
                }
            }
        }
    }
}
