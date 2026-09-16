package p000;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۦۤٚؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5686 {

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC4507 f18690;

    /* JADX INFO: renamed from: ۥَ */
    public final C3194 f18691;

    /* JADX INFO: renamed from: ۥُ */
    public final InterfaceC4680 f18692;

    /* JADX INFO: renamed from: ۥّ */
    public final C4789 f18693;

    /* JADX INFO: renamed from: ۥْ */
    public final C1523 f18694;

    /* JADX INFO: renamed from: ۥٓ */
    public final C2497 f18695;

    /* JADX INFO: renamed from: ۥٖ */
    public final C3379 f18696;

    /* JADX INFO: renamed from: ۥۖ */
    public final ComponentCallbacks2C2631 f18697;

    /* JADX INFO: renamed from: ۥۗ */
    public final AbstractC2109 f18698;

    /* JADX INFO: renamed from: ۥۜ */
    public final Configuration f18699;

    /* JADX INFO: renamed from: ۥۣ */
    public final View f18700;

    /* JADX INFO: renamed from: ۦؑ */
    public final InterfaceC3983 f18701;

    /* JADX INFO: renamed from: ۦؚ */
    public final C0761 f18702;

    /* JADX INFO: renamed from: ۦٌ */
    public final C2471 f18703;

    /* JADX INFO: renamed from: ۦِ */
    public final C0915 f18704;

    /* JADX INFO: renamed from: ۦٗ */
    public int f18705;

    /* JADX INFO: renamed from: ۦٛ */
    public final InterfaceC4367 f18706;

    /* JADX INFO: renamed from: ۦۗ */
    public final C0555 f18707;

    /* JADX INFO: renamed from: ۦۙ */
    public final C4446 f18708;

    /* JADX INFO: renamed from: ۦۚ */
    public final InterfaceC0601 f18709;

    /* JADX INFO: renamed from: ۦۛ */
    public final C5285 f18710;

    /* JADX INFO: renamed from: ۦ۟ */
    public final InterfaceC1922 f18711;

    /* JADX INFO: renamed from: ۦۨ */
    public final InterfaceC4367 f18712;

    public C5686(C5686 c5686, View view, AbstractC2109 abstractC2109, InterfaceC4507 interfaceC4507, InterfaceC3983 interfaceC3983, InterfaceC4680 interfaceC4680) {
        C0915 c0915;
        InterfaceC0601 c1298;
        boolean zM6874 = AbstractC3831.m6874(c5686 != null ? c5686.f18700.getContext() : null, view.getContext());
        this.f18700 = view;
        this.f18698 = abstractC2109;
        this.f18690 = interfaceC4507;
        this.f18701 = interfaceC3983;
        this.f18692 = interfaceC4680;
        this.f18693 = zM6874 ? c5686.f18693 : new C4789();
        this.f18708 = c5686 != null ? c5686.f18708 : new C4446();
        Configuration configuration = zM6874 ? c5686.f18699 : new Configuration(view.getContext().getResources().getConfiguration());
        this.f18699 = configuration;
        this.f18706 = zM6874 ? c5686.f18706 : AbstractC2774.m5183(new Configuration(configuration));
        if (zM6874) {
            c0915 = c5686.f18704;
        } else {
            Context context = view.getContext();
            c0915 = new C0915();
        }
        this.f18704 = c0915;
        this.f18707 = zM6874 ? c5686.f18707 : new C0555(view.getContext());
        C0761 c0761 = zM6874 ? c5686.f18702 : new C0761(view.getContext());
        this.f18702 = c0761;
        this.f18703 = zM6874 ? c5686.f18703 : new C2471(c0761);
        if (zM6874) {
            c1298 = c5686.f18709;
        } else {
            view.getContext();
            c1298 = new C1298(26);
        }
        this.f18709 = c1298;
        this.f18712 = zM6874 ? c5686.f18712 : new C4852(AbstractC0949.m1931(view.getContext()), C1397.f4792);
        this.f18711 = view == (c5686 != null ? c5686.f18700 : null) ? c5686.f18711 : new C1651(view);
        this.f18694 = zM6874 ? c5686.f18694 : new C1523(ViewConfiguration.get(view.getContext()));
        this.f18695 = c5686 != null ? c5686.f18695 : new C2497();
        this.f18691 = new C3194();
        this.f18696 = c5686 != null ? c5686.f18696 : new C3379();
        this.f18710 = new C5285(5, this);
        this.f18697 = new ComponentCallbacks2C2631(this);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m9500() {
        int i = this.f18705 + 1;
        this.f18705 = i;
        if (i == 1) {
            View view = this.f18700;
            Context context = view.getContext();
            ComponentCallbacks2C2631 componentCallbacks2C2631 = this.f18697;
            context.registerComponentCallbacks(componentCallbacks2C2631);
            m9503(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            C3194 c3194 = this.f18691;
            c3194.f10730.setValue(Boolean.valueOf(zHasWindowFocus));
            C4852 c4852 = c3194.f10731;
            C5285 c5285 = this.f18710;
            if (c4852 == null) {
                c3194.f10732 = c5285;
            }
            if (c4852 != null) {
                c4852.setValue(c5285.mo449());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(componentCallbacks2C2631);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m9501() {
        int i = this.f18705 - 1;
        this.f18705 = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            i = 0;
            this.f18705 = 0;
        }
        if (i == 0) {
            View view = this.f18700;
            Context context = view.getContext();
            ComponentCallbacks2C2631 componentCallbacks2C2631 = this.f18697;
            context.unregisterComponentCallbacks(componentCallbacks2C2631);
            C3194 c3194 = this.f18691;
            if (c3194.f10731 == null) {
                c3194.f10732 = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(componentCallbacks2C2631);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m9502(ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850, C0857 c0857, C5362 c5362, int i) {
        boolean z;
        c5362.m8979(123858079);
        int i2 = (c5362.m8977(viewTreeObserverOnGlobalLayoutListenerC0850) ? 4 : 2) | i | (c5362.m8977(c0857) ? 32 : 16) | (c5362.m8977(this) ? 256 : 128);
        int i3 = 1;
        if (c5362.m9011(i2 & 1, (i2 & 147) != 146)) {
            Object tag = viewTreeObserverOnGlobalLayoutListenerC0850.getTag(R.id.inspection_slot_table_set);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof InterfaceC3984) && !(tag instanceof InterfaceC4953))) ? null : (Set) tag;
            if (set == null) {
                Object parent = viewTreeObserverOnGlobalLayoutListenerC0850.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC3984) && !(tag2 instanceof InterfaceC4953))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(c5362.m8973());
                c5362.f17650 = true;
                c5362.f17646 = true;
                c5362.f17645.m4875();
                c5362.f17669.m4875();
                C0126 c0126 = c5362.f17665;
                C2575 c2575 = c0126.f492;
                c0126.f484 = c2575.f8599;
                c0126.f485 = c2575.f8597;
            }
            Object objM8999 = c5362.m8999();
            InterfaceC3983 interfaceC3983 = this.f18701;
            C4036 c4036 = C2850.f9517;
            if (objM8999 == c4036) {
                View view2 = (View) viewTreeObserverOnGlobalLayoutListenerC0850.getParent();
                Object tag3 = view2.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                String strM6628 = AbstractC3761.m6628("SaveableStateRegistry:", strValueOf);
                C2346 c2346Mo648 = interfaceC3983.mo648();
                Bundle bundleM4415 = c2346Mo648.m4415(strM6628);
                if (bundleM4415 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleM4415.keySet()) {
                        linkedHashMap.put(str, bundleM4415.getParcelableArrayList(str));
                    }
                }
                C1931 c1931 = C1931.f6381;
                C4216 c4216 = AbstractC3198.f10737;
                C5762 c5762 = new C5762(linkedHashMap, c1931);
                if (c2346Mo648.m4419(strM6628) != null) {
                    z = false;
                } else {
                    try {
                        c2346Mo648.m4413(strM6628, new C5444(i3, c5762));
                        z = true;
                    } catch (IllegalArgumentException unused) {
                        z = false;
                    }
                }
                C1493 c1493 = new C1493(c5762, new C5070(z, c2346Mo648, strM6628));
                c5362.m8987(c1493);
                objM8999 = c1493;
            }
            C1493 c1494 = (C1493) objM8999;
            boolean zM8977 = c5362.m8977(c1494);
            Object objM89910 = c5362.m8999();
            if (zM8977 || objM89910 == c4036) {
                objM89910 = new C2932(10, c1494);
                c5362.m8987(objM89910);
            }
            AbstractC3925.m7028(C2358.f7817, (InterfaceC4745) objM89910, c5362);
            C4216 c4217 = AbstractC2853.f9542;
            boolean zBooleanValue = ((Boolean) c5362.m8997(c4217)).booleanValue() | viewTreeObserverOnGlobalLayoutListenerC0850.getScrollCaptureInProgress$ui();
            boolean zM8963 = c5362.m8963(viewTreeObserverOnGlobalLayoutListenerC0850.getView());
            Object objM89911 = c5362.m8999();
            if (zM8963 || objM89911 == c4036) {
                viewTreeObserverOnGlobalLayoutListenerC0850.getView();
                objM89911 = new C1336();
                c5362.m8987(objM89911);
            }
            C4773.m8123(new C3467[]{AbstractC1744.f5787.mo4313(this.f18690), AbstractC0802.f2868.mo4313(interfaceC3983), AbstractC4354.f14357.mo4313(this.f18693), AbstractC4354.f14353.mo4313(this.f18708), AbstractC4354.f14355.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getContext()), AbstractC5612.f18471.mo4313(set), AbstractC4354.f14356.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getConfiguration()), AbstractC3198.f10737.mo4313(c1494), AbstractC4354.f14354.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getView()), c4217.mo4313(Boolean.valueOf(zBooleanValue)), AbstractC2853.f9541.mo4313(viewTreeObserverOnGlobalLayoutListenerC0850.getViewConfiguration()), AbstractC3074.f10321.mo4313((C1336) objM89911)}, AbstractC3925.m7034(1317454175, new C3712(viewTreeObserverOnGlobalLayoutListenerC0850, this, c0857), c5362), c5362, 56);
        } else {
            c5362.m8982();
        }
        C5863 c5863M8965 = c5362.m8965();
        if (c5863M8965 != null) {
            c5863M8965.f19365 = new C3712(this, viewTreeObserverOnGlobalLayoutListenerC0850, c0857, i);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m9503(Configuration configuration) {
        int iUpdateFrom = this.f18699.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f18693.f15799.entrySet().iterator();
            while (it.hasNext()) {
                C4977 c4977 = (C4977) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (c4977 == null || Configuration.needNewResources(iUpdateFrom, c4977.f16463)) {
                    it.remove();
                }
            }
            this.f18706.setValue(new Configuration(configuration));
            C4446 c4446 = this.f18708;
            synchronized (c4446) {
                c4446.f14659.m8314();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                this.f18712.setValue(AbstractC0949.m1931(this.f18700.getContext()));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                C3194 c3194 = this.f18691;
                C5285 c5285 = this.f18710;
                C4852 c4852 = c3194.f10731;
                if (c4852 != null) {
                    c4852.setValue(c5285.mo449());
                }
            }
        }
    }
}
