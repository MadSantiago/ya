package p000;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: ۦُؕؒؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC3904 extends AbstractC5381 implements InterfaceC5448, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: ۥً */
    public ViewTreeObserver f13032;

    /* JADX INFO: renamed from: ۦٚ */
    public final C3452 f13034 = new C3452(this, 0);

    /* JADX INFO: renamed from: ۥٕ */
    public final C3452 f13033 = new C3452(this, 1);

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        boolean z2;
        if (AbstractC5537.m9270(this).f2259 == null) {
            return;
        }
        View viewM7159 = AbstractC4009.m7159(this);
        InterfaceC0475 focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0850) AbstractC5537.m9224(this)).getFocusOwner();
        InterfaceC2043 interfaceC2043M9224 = AbstractC5537.m9224(this);
        if (view != null && !view.equals(interfaceC2043M9224)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                } else {
                    if (parent == viewM7159.getParent()) {
                        z = true;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            z = false;
            break;
        }
        if (view2 != null && !view2.equals(interfaceC2043M9224)) {
            ViewParent parent2 = view2.getParent();
            while (true) {
                if (parent2 == null) {
                    z2 = false;
                    break;
                } else {
                    if (parent2 == viewM7159.getParent()) {
                        z2 = true;
                        break;
                    }
                    parent2 = parent2.getParent();
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (z && z2) {
            return;
        }
        if (!z2) {
            if (z && m6975().m6254().m7315()) {
                ((C2016) focusOwner).m3927(8, false, false);
                return;
            }
            return;
        }
        C3468 c3468M6975 = m6975();
        int iOrdinal = c3468M6975.m6254().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return;
        }
        if (iOrdinal == 3) {
            AbstractC1434.m3050(c3468M6975);
        } else {
            C1078.m2275();
        }
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۥ */
    public final void mo780() {
        ViewTreeObserver viewTreeObserver = AbstractC4489.m7803(this).getViewTreeObserver();
        this.f13032 = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    /* JADX INFO: renamed from: ۥؑ */
    public final C3468 m6975() {
        boolean z;
        if (!this.f17791.f17786) {
            AbstractC3480.m6278("visitLocalDescendants called on an unattached node");
        }
        AbstractC5381 abstractC5381 = this.f17791;
        if ((abstractC5381.f17782 & 1024) != 0) {
            boolean z2 = false;
            for (AbstractC5381 abstractC5382 = abstractC5381.f17783; abstractC5382 != null; abstractC5382 = abstractC5382.f17783) {
                if ((abstractC5382.f17781 & 1024) != 0) {
                    AbstractC5381 abstractC5381M9233 = abstractC5382;
                    C0863 c0863 = null;
                    while (abstractC5381M9233 != null) {
                        if (abstractC5381M9233 instanceof C3468) {
                            C3468 c3468 = (C3468) abstractC5381M9233;
                            if (z2) {
                                return c3468;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (abstractC5381M9233.f17781 & 1024) != 0 && (abstractC5381M9233 instanceof AbstractC3019)) {
                            int i = 0;
                            for (AbstractC5381 abstractC5383 = ((AbstractC3019) abstractC5381M9233).f10167; abstractC5383 != null; abstractC5383 = abstractC5383.f17783) {
                                if ((abstractC5383.f17781 & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC5381M9233 = abstractC5383;
                                    } else {
                                        if (c0863 == null) {
                                            c0863 = new C0863(new AbstractC5381[16]);
                                        }
                                        if (abstractC5381M9233 != null) {
                                            c0863.m1843(abstractC5381M9233);
                                            abstractC5381M9233 = null;
                                        }
                                        c0863.m1843(abstractC5383);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC5381M9233 = AbstractC5537.m9233(c0863);
                    }
                }
            }
        }
        C1078.m2276("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // p000.InterfaceC5448
    /* JADX INFO: renamed from: ۥؙ */
    public final void mo5853(InterfaceC0133 interfaceC0133) {
        interfaceC0133.mo299(false);
        interfaceC0133.mo297(this.f13034);
        interfaceC0133.mo298(this.f13033);
    }

    @Override // p000.AbstractC5381
    /* JADX INFO: renamed from: ۦٓ */
    public final void mo788() {
        ViewTreeObserver viewTreeObserver = this.f13032;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f13032 = null;
        AbstractC4489.m7803(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
    }
}
