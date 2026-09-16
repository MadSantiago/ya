package p000;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥؙْ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1239 {

    /* JADX INFO: renamed from: ۥؗ */
    public final AbstractComponentCallbacksC0308 f4258;

    /* JADX INFO: renamed from: ۥۗ */
    public final C1489 f4260;

    /* JADX INFO: renamed from: ۥۣ */
    public final C5002 f4261;

    /* JADX INFO: renamed from: ۦؑ */
    public boolean f4262 = false;

    /* JADX INFO: renamed from: ۥُ */
    public int f4259 = -1;

    public C1239(C5002 c5002, C1489 c1489, ClassLoader classLoader, C3698 c3698, Bundle bundle) {
        this.f4261 = c5002;
        this.f4260 = c1489;
        C5003 c5003 = (C5003) bundle.getParcelable("state");
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308M6561 = c3698.m6561(c5003.f16567);
        abstractComponentCallbacksC0308M6561.f1118 = c5003.f16566;
        abstractComponentCallbacksC0308M6561.f1137 = c5003.f16557;
        abstractComponentCallbacksC0308M6561.f1148 = c5003.f16558;
        abstractComponentCallbacksC0308M6561.f1122 = true;
        abstractComponentCallbacksC0308M6561.f1146 = c5003.f16556;
        abstractComponentCallbacksC0308M6561.f1113 = c5003.f16559;
        abstractComponentCallbacksC0308M6561.f1150 = c5003.f16564;
        abstractComponentCallbacksC0308M6561.f1126 = c5003.f16565;
        abstractComponentCallbacksC0308M6561.f1114 = c5003.f16561;
        abstractComponentCallbacksC0308M6561.f1124 = c5003.f16563;
        abstractComponentCallbacksC0308M6561.f1153 = c5003.f16560;
        abstractComponentCallbacksC0308M6561.f1138 = EnumC0458.values()[c5003.f16554];
        abstractComponentCallbacksC0308M6561.f1149 = c5003.f16553;
        abstractComponentCallbacksC0308M6561.f1128 = c5003.f16562;
        abstractComponentCallbacksC0308M6561.f1116 = c5003.f16555;
        this.f4258 = abstractComponentCallbacksC0308M6561;
        abstractComponentCallbacksC0308M6561.f1151 = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        C2790 c2790 = abstractComponentCallbacksC0308M6561.f1141;
        if (c2790 != null && (c2790.f9317 || c2790.f9314)) {
            C1078.m2276("Fragment already added and state has been saved");
            throw null;
        }
        abstractComponentCallbacksC0308M6561.f1123 = bundle2;
        if (C2790.m5261(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + abstractComponentCallbacksC0308M6561);
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final int m2614() {
        C4526 c4526;
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (abstractComponentCallbacksC0308.f1141 == null) {
            return abstractComponentCallbacksC0308.f1155;
        }
        int iMin = this.f4259;
        int iOrdinal = abstractComponentCallbacksC0308.f1138.ordinal();
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0308.f1137) {
            boolean z = abstractComponentCallbacksC0308.f1117;
            int i = this.f4259;
            if (z) {
                iMin = Math.max(i, 2);
            } else {
                iMin = i < 4 ? Math.min(iMin, abstractComponentCallbacksC0308.f1155) : Math.min(iMin, 1);
            }
        }
        if (abstractComponentCallbacksC0308.f1148 && abstractComponentCallbacksC0308.f1127 == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!abstractComponentCallbacksC0308.f1125) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC0308.f1127;
        if (viewGroup != null) {
            abstractComponentCallbacksC0308.m657().m5298();
            Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
            if (tag instanceof C4526) {
                c4526 = (C4526) tag;
            } else {
                c4526 = new C4526(viewGroup);
                viewGroup.setTag(R.id.special_effects_controller_view_tag, c4526);
            }
            Iterator it = c4526.f14961.iterator();
            if (it.hasNext()) {
                throw null;
            }
            Iterator it2 = c4526.f14958.iterator();
            if (it2.hasNext()) {
                throw null;
            }
        }
        if (abstractComponentCallbacksC0308.f1114) {
            iMin = abstractComponentCallbacksC0308.m653() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC0308.f1131 && abstractComponentCallbacksC0308.f1155 < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (abstractComponentCallbacksC0308.f1112) {
            iMin = Math.max(iMin, 3);
        }
        if (C2790.m5261(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + abstractComponentCallbacksC0308);
        }
        return iMin;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m2615() {
        String resourceName;
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (abstractComponentCallbacksC0308.f1137) {
            return;
        }
        if (C2790.m5261(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0308);
        }
        Bundle bundle = abstractComponentCallbacksC0308.f1151;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterMo645 = abstractComponentCallbacksC0308.mo645(bundle2);
        ViewGroup viewGroup2 = abstractComponentCallbacksC0308.f1127;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = abstractComponentCallbacksC0308.f1113;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + abstractComponentCallbacksC0308 + " for a container view with no id");
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC0308.f1141.f9324.mo1305(i);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC0308.f1122 && !abstractComponentCallbacksC0308.f1148) {
                        try {
                            resourceName = abstractComponentCallbacksC0308.m646().getResources().getResourceName(abstractComponentCallbacksC0308.f1113);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC0308.f1113) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC0308);
                    }
                } else if (!(viewGroup instanceof C5189)) {
                    C3168 c3168 = AbstractC3787.f12578;
                    AbstractC3787.m6703(new C3672(abstractComponentCallbacksC0308, "Attempting to add fragment " + abstractComponentCallbacksC0308 + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC3787.m6704(abstractComponentCallbacksC0308).getClass();
                }
            }
        }
        abstractComponentCallbacksC0308.f1127 = viewGroup;
        abstractComponentCallbacksC0308.mo655(layoutInflaterMo645, viewGroup, bundle2);
        abstractComponentCallbacksC0308.f1155 = 2;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m2616() {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308M3170;
        boolean zM5261 = C2790.m5261(3);
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (zM5261) {
            Log.d("FragmentManager", "movefrom CREATED: " + abstractComponentCallbacksC0308);
        }
        boolean z = abstractComponentCallbacksC0308.f1114 && !abstractComponentCallbacksC0308.m653();
        C1489 c1489 = this.f4260;
        if (z) {
            c1489.m3119(abstractComponentCallbacksC0308.f1118, null);
        }
        if (!z) {
            C0333 c0333 = (C0333) c1489.f5056;
            if (!((c0333.f1247.containsKey(abstractComponentCallbacksC0308.f1118) && c0333.f1245) ? c0333.f1246 : true)) {
                String str = abstractComponentCallbacksC0308.f1149;
                if (str != null && (abstractComponentCallbacksC0308M3170 = c1489.m3170(str)) != null && abstractComponentCallbacksC0308M3170.f1126) {
                    abstractComponentCallbacksC0308.f1147 = abstractComponentCallbacksC0308M3170;
                }
                abstractComponentCallbacksC0308.f1155 = 0;
                return;
            }
        }
        C0827 c0827 = abstractComponentCallbacksC0308.f1136;
        boolean z2 = c0827 != null ? ((C0333) c1489.f5056).f1246 : !c0827.f2924.isChangingConfigurations();
        if (z || z2) {
            ((C0333) c1489.f5056).m765(abstractComponentCallbacksC0308, false);
        }
        abstractComponentCallbacksC0308.f1142.m5300();
        abstractComponentCallbacksC0308.f1152.m7369(EnumC1924.ON_DESTROY);
        abstractComponentCallbacksC0308.f1155 = 0;
        abstractComponentCallbacksC0308.f1139 = false;
        abstractComponentCallbacksC0308.f1154 = false;
        abstractComponentCallbacksC0308.f1139 = true;
        if (!abstractComponentCallbacksC0308.f1139) {
            C5028.m8451(abstractComponentCallbacksC0308, " did not call through to super.onDestroy()");
            return;
        }
        this.f4261.m8421(abstractComponentCallbacksC0308, false);
        for (C1239 c1239 : c1489.m3121()) {
            if (c1239 != null) {
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = c1239.f4258;
                if (abstractComponentCallbacksC0308.f1118.equals(abstractComponentCallbacksC0309.f1149)) {
                    abstractComponentCallbacksC0309.f1147 = abstractComponentCallbacksC0308;
                    abstractComponentCallbacksC0309.f1149 = null;
                }
            }
        }
        String str2 = abstractComponentCallbacksC0308.f1149;
        if (str2 != null) {
            abstractComponentCallbacksC0308.f1147 = c1489.m3170(str2);
        }
        c1489.m3141(this);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m2617() {
        boolean zM5261 = C2790.m5261(3);
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (zM5261) {
            Log.d("FragmentManager", "moveto ATTACHED: " + abstractComponentCallbacksC0308);
        }
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = abstractComponentCallbacksC0308.f1147;
        C1239 c1239 = null;
        C1489 c1489 = this.f4260;
        if (abstractComponentCallbacksC0309 != null) {
            C1239 c12310 = (C1239) ((HashMap) c1489.f5057).get(abstractComponentCallbacksC0309.f1118);
            if (c12310 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC0308);
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC03010 = abstractComponentCallbacksC0308.f1147;
                sb.append(" declared target fragment ");
                sb.append(abstractComponentCallbacksC03010);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            abstractComponentCallbacksC0308.f1149 = abstractComponentCallbacksC0308.f1147.f1118;
            abstractComponentCallbacksC0308.f1147 = null;
            c1239 = c12310;
        } else {
            String str = abstractComponentCallbacksC0308.f1149;
            if (str != null && (c1239 = (C1239) ((HashMap) c1489.f5057).get(str)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(abstractComponentCallbacksC0308);
                sb2.append(" declared target fragment ");
                C1078.m2276(AbstractC3761.m6621(sb2, abstractComponentCallbacksC0308.f1149, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (c1239 != null) {
            c1239.m2623();
        }
        C2790 c2790 = abstractComponentCallbacksC0308.f1141;
        abstractComponentCallbacksC0308.f1136 = c2790.f9309;
        abstractComponentCallbacksC0308.f1144 = c2790.f9308;
        C5002 c5002 = this.f4261;
        c5002.m8397(abstractComponentCallbacksC0308, false);
        ArrayList arrayList = abstractComponentCallbacksC0308.f1140;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C5173) it.next()).m8779();
        }
        arrayList.clear();
        abstractComponentCallbacksC0308.f1142.m5283(abstractComponentCallbacksC0308.f1136, abstractComponentCallbacksC0308.mo650(), abstractComponentCallbacksC0308);
        abstractComponentCallbacksC0308.f1155 = 0;
        abstractComponentCallbacksC0308.f1139 = false;
        abstractComponentCallbacksC0308.mo662(abstractComponentCallbacksC0308.f1136.f2924);
        if (!abstractComponentCallbacksC0308.f1139) {
            C5028.m8451(abstractComponentCallbacksC0308, " did not call through to super.onAttach()");
            return;
        }
        Iterator it2 = abstractComponentCallbacksC0308.f1141.f9334.iterator();
        while (it2.hasNext()) {
            ((InterfaceC5366) it2.next()).mo1721();
        }
        C2790 c2791 = abstractComponentCallbacksC0308.f1142;
        c2791.f9317 = false;
        c2791.f9314 = false;
        c2791.f9335.f1249 = false;
        c2791.m5305(0);
        c5002.m8409(abstractComponentCallbacksC0308, false);
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m2618() {
        boolean zM5261 = C2790.m5261(3);
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (zM5261) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + abstractComponentCallbacksC0308);
        }
        abstractComponentCallbacksC0308.f1155 = -1;
        abstractComponentCallbacksC0308.f1139 = false;
        abstractComponentCallbacksC0308.mo641();
        if (!abstractComponentCallbacksC0308.f1139) {
            C5028.m8451(abstractComponentCallbacksC0308, " did not call through to super.onDetach()");
            return;
        }
        C2790 c2790 = abstractComponentCallbacksC0308.f1142;
        if (!c2790.f9318) {
            c2790.m5300();
            abstractComponentCallbacksC0308.f1142 = new C2790();
        }
        this.f4261.m8420(abstractComponentCallbacksC0308, false);
        abstractComponentCallbacksC0308.f1155 = -1;
        abstractComponentCallbacksC0308.f1136 = null;
        abstractComponentCallbacksC0308.f1144 = null;
        abstractComponentCallbacksC0308.f1141 = null;
        if (!abstractComponentCallbacksC0308.f1114 || abstractComponentCallbacksC0308.m653()) {
            C0333 c0333 = (C0333) this.f4260.f5056;
            if (!((c0333.f1247.containsKey(abstractComponentCallbacksC0308.f1118) && c0333.f1245) ? c0333.f1246 : true)) {
                return;
            }
        }
        if (C2790.m5261(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0308);
        }
        abstractComponentCallbacksC0308.m658();
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m2619() {
        boolean zM5261 = C2790.m5261(3);
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (zM5261) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + abstractComponentCallbacksC0308);
        }
        Bundle bundle = abstractComponentCallbacksC0308.f1151;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC0308.f1142.m5278();
        abstractComponentCallbacksC0308.f1155 = 3;
        abstractComponentCallbacksC0308.f1139 = false;
        abstractComponentCallbacksC0308.mo660();
        if (!abstractComponentCallbacksC0308.f1139) {
            C5028.m8451(abstractComponentCallbacksC0308, " did not call through to super.onActivityCreated()");
            return;
        }
        if (C2790.m5261(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + abstractComponentCallbacksC0308);
        }
        abstractComponentCallbacksC0308.f1151 = null;
        C2790 c2790 = abstractComponentCallbacksC0308.f1142;
        c2790.f9317 = false;
        c2790.f9314 = false;
        c2790.f9335.f1249 = false;
        c2790.m5305(4);
        this.f4261.m8416(abstractComponentCallbacksC0308, false);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m2620() {
        Bundle bundle;
        boolean zM5261 = C2790.m5261(3);
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (zM5261) {
            Log.d("FragmentManager", "moveto CREATED: " + abstractComponentCallbacksC0308);
        }
        Bundle bundle2 = abstractComponentCallbacksC0308.f1151;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC0308.f1154) {
            abstractComponentCallbacksC0308.f1155 = 1;
            Bundle bundle4 = abstractComponentCallbacksC0308.f1151;
            if (bundle4 == null || (bundle = bundle4.getBundle("childFragmentManager")) == null) {
                return;
            }
            abstractComponentCallbacksC0308.f1142.m5287(bundle);
            C2790 c2790 = abstractComponentCallbacksC0308.f1142;
            c2790.f9317 = false;
            c2790.f9314 = false;
            c2790.f9335.f1249 = false;
            c2790.m5305(1);
            return;
        }
        C5002 c5002 = this.f4261;
        c5002.m8395(abstractComponentCallbacksC0308, false);
        abstractComponentCallbacksC0308.f1142.m5278();
        abstractComponentCallbacksC0308.f1155 = 1;
        abstractComponentCallbacksC0308.f1139 = false;
        abstractComponentCallbacksC0308.f1152.mo2388(new C0828(abstractComponentCallbacksC0308));
        abstractComponentCallbacksC0308.mo643(bundle3);
        abstractComponentCallbacksC0308.f1154 = true;
        if (!abstractComponentCallbacksC0308.f1139) {
            C5028.m8451(abstractComponentCallbacksC0308, " did not call through to super.onCreate()");
        } else {
            abstractComponentCallbacksC0308.f1152.m7369(EnumC1924.ON_CREATE);
            c5002.m8418(abstractComponentCallbacksC0308, false);
        }
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m2621(ClassLoader classLoader) {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        Bundle bundle = abstractComponentCallbacksC0308.f1151;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC0308.f1151.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC0308.f1151.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC0308.f1120 = abstractComponentCallbacksC0308.f1151.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC0308.f1121 = abstractComponentCallbacksC0308.f1151.getBundle("viewRegistryState");
            C5003 c5003 = (C5003) abstractComponentCallbacksC0308.f1151.getParcelable("state");
            if (c5003 != null) {
                abstractComponentCallbacksC0308.f1149 = c5003.f16553;
                abstractComponentCallbacksC0308.f1128 = c5003.f16562;
                abstractComponentCallbacksC0308.f1116 = c5003.f16555;
            }
            if (abstractComponentCallbacksC0308.f1116) {
                return;
            }
            abstractComponentCallbacksC0308.f1131 = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC0308, e);
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m2622() {
        boolean zM5261 = C2790.m5261(3);
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (zM5261) {
            Log.d("FragmentManager", "moveto RESUMED: " + abstractComponentCallbacksC0308);
        }
        C4613 c4613 = abstractComponentCallbacksC0308.f1115;
        View view = c4613 == null ? null : c4613.f15237;
        if (view != null) {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            }
        }
        abstractComponentCallbacksC0308.m642().f15237 = null;
        abstractComponentCallbacksC0308.f1142.m5278();
        abstractComponentCallbacksC0308.f1142.m5265(true);
        abstractComponentCallbacksC0308.f1155 = 7;
        abstractComponentCallbacksC0308.f1139 = false;
        abstractComponentCallbacksC0308.f1139 = true;
        if (!abstractComponentCallbacksC0308.f1139) {
            C5028.m8451(abstractComponentCallbacksC0308, " did not call through to super.onResume()");
            return;
        }
        abstractComponentCallbacksC0308.f1152.m7369(EnumC1924.ON_RESUME);
        C2790 c2790 = abstractComponentCallbacksC0308.f1142;
        c2790.f9317 = false;
        c2790.f9314 = false;
        c2790.f9335.f1249 = false;
        c2790.m5305(7);
        this.f4261.m8399(abstractComponentCallbacksC0308, false);
        this.f4260.m3119(abstractComponentCallbacksC0308.f1118, null);
        abstractComponentCallbacksC0308.f1151 = null;
        abstractComponentCallbacksC0308.f1120 = null;
        abstractComponentCallbacksC0308.f1121 = null;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m2623() {
        C1489 c1489 = this.f4260;
        boolean z = this.f4262;
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (z) {
            if (C2790.m5261(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + abstractComponentCallbacksC0308);
                return;
            }
            return;
        }
        try {
            this.f4262 = true;
            boolean z2 = false;
            while (true) {
                int iM2614 = m2614();
                int i = abstractComponentCallbacksC0308.f1155;
                if (iM2614 == i) {
                    if (!z2 && i == -1 && abstractComponentCallbacksC0308.f1114 && !abstractComponentCallbacksC0308.m653()) {
                        if (C2790.m5261(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + abstractComponentCallbacksC0308);
                        }
                        ((C0333) c1489.f5056).m765(abstractComponentCallbacksC0308, true);
                        c1489.m3141(this);
                        if (C2790.m5261(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + abstractComponentCallbacksC0308);
                        }
                        abstractComponentCallbacksC0308.m658();
                    }
                    if (abstractComponentCallbacksC0308.f1132) {
                        C2790 c2790 = abstractComponentCallbacksC0308.f1141;
                        if (c2790 != null && abstractComponentCallbacksC0308.f1125 && C2790.m5262(abstractComponentCallbacksC0308)) {
                            c2790.f9319 = true;
                        }
                        abstractComponentCallbacksC0308.f1132 = false;
                        abstractComponentCallbacksC0308.f1142.m5315();
                    }
                    return;
                }
                if (iM2614 <= i) {
                    switch (i - 1) {
                        case -1:
                            m2618();
                            break;
                        case 0:
                            m2616();
                            break;
                        case 1:
                            m2626();
                            abstractComponentCallbacksC0308.f1155 = 1;
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            abstractComponentCallbacksC0308.f1117 = false;
                            abstractComponentCallbacksC0308.f1155 = 2;
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            if (C2790.m5261(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + abstractComponentCallbacksC0308);
                            }
                            abstractComponentCallbacksC0308.f1155 = 3;
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            m2628();
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            abstractComponentCallbacksC0308.f1155 = 5;
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            m2625();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            m2617();
                            break;
                        case 1:
                            m2620();
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            m2624();
                            m2615();
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            m2619();
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            abstractComponentCallbacksC0308.f1155 = 4;
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            m2627();
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            abstractComponentCallbacksC0308.f1155 = 6;
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            m2622();
                            break;
                    }
                }
                z2 = true;
            }
        } finally {
            this.f4262 = false;
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m2624() {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (abstractComponentCallbacksC0308.f1137 && abstractComponentCallbacksC0308.f1117 && !abstractComponentCallbacksC0308.f1130) {
            if (C2790.m5261(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + abstractComponentCallbacksC0308);
            }
            Bundle bundle = abstractComponentCallbacksC0308.f1151;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            abstractComponentCallbacksC0308.mo655(abstractComponentCallbacksC0308.mo645(bundle2), null, bundle2);
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m2625() {
        boolean zM5261 = C2790.m5261(3);
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (zM5261) {
            Log.d("FragmentManager", "movefrom RESUMED: " + abstractComponentCallbacksC0308);
        }
        abstractComponentCallbacksC0308.f1142.m5305(5);
        abstractComponentCallbacksC0308.f1152.m7369(EnumC1924.ON_PAUSE);
        abstractComponentCallbacksC0308.f1155 = 6;
        abstractComponentCallbacksC0308.f1139 = true;
        this.f4261.m8396(abstractComponentCallbacksC0308, false);
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m2626() {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (C2790.m5261(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + abstractComponentCallbacksC0308);
        }
        abstractComponentCallbacksC0308.f1142.m5305(1);
        abstractComponentCallbacksC0308.f1155 = 1;
        abstractComponentCallbacksC0308.f1139 = false;
        abstractComponentCallbacksC0308.mo644();
        if (!abstractComponentCallbacksC0308.f1139) {
            C5028.m8451(abstractComponentCallbacksC0308, " did not call through to super.onDestroyView()");
            return;
        }
        C1870 c1870 = ((C5908) C3369.m6127(abstractComponentCallbacksC0308).f11254).f19492;
        if (c1870.f6215 > 0) {
            c1870.m3724(0).getClass();
            C0178.m382();
            return;
        }
        abstractComponentCallbacksC0308.f1130 = false;
        this.f4261.m8411(abstractComponentCallbacksC0308, false);
        abstractComponentCallbacksC0308.f1127 = null;
        C3543 c3543 = abstractComponentCallbacksC0308.f1119;
        c3543.getClass();
        C3543.m6343("setValue");
        c3543.f11771++;
        c3543.f11763 = null;
        c3543.m6344(null);
        abstractComponentCallbacksC0308.f1117 = false;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m2627() {
        boolean zM5261 = C2790.m5261(3);
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (zM5261) {
            Log.d("FragmentManager", "moveto STARTED: " + abstractComponentCallbacksC0308);
        }
        abstractComponentCallbacksC0308.f1142.m5278();
        abstractComponentCallbacksC0308.f1142.m5265(true);
        abstractComponentCallbacksC0308.f1155 = 5;
        abstractComponentCallbacksC0308.f1139 = false;
        abstractComponentCallbacksC0308.mo661();
        if (!abstractComponentCallbacksC0308.f1139) {
            C5028.m8451(abstractComponentCallbacksC0308, " did not call through to super.onStart()");
            return;
        }
        abstractComponentCallbacksC0308.f1152.m7369(EnumC1924.ON_START);
        C2790 c2790 = abstractComponentCallbacksC0308.f1142;
        c2790.f9317 = false;
        c2790.f9314 = false;
        c2790.f9335.f1249 = false;
        c2790.m5305(5);
        this.f4261.m8419(abstractComponentCallbacksC0308, false);
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m2628() {
        boolean zM5261 = C2790.m5261(3);
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f4258;
        if (zM5261) {
            Log.d("FragmentManager", "movefrom STARTED: " + abstractComponentCallbacksC0308);
        }
        C2790 c2790 = abstractComponentCallbacksC0308.f1142;
        c2790.f9314 = true;
        c2790.f9335.f1249 = true;
        c2790.m5305(4);
        abstractComponentCallbacksC0308.f1152.m7369(EnumC1924.ON_STOP);
        abstractComponentCallbacksC0308.f1155 = 4;
        abstractComponentCallbacksC0308.f1139 = false;
        abstractComponentCallbacksC0308.mo647();
        if (abstractComponentCallbacksC0308.f1139) {
            this.f4261.m8401(abstractComponentCallbacksC0308, false);
        } else {
            C5028.m8451(abstractComponentCallbacksC0308, " did not call through to super.onStop()");
        }
    }

    public C1239(C5002 c5002, C1489 c1489, AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        this.f4261 = c5002;
        this.f4260 = c1489;
        this.f4258 = abstractComponentCallbacksC0308;
    }

    public C1239(C5002 c5002, C1489 c1489, AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, Bundle bundle) {
        this.f4261 = c5002;
        this.f4260 = c1489;
        this.f4258 = abstractComponentCallbacksC0308;
        abstractComponentCallbacksC0308.f1120 = null;
        abstractComponentCallbacksC0308.f1121 = null;
        abstractComponentCallbacksC0308.f1143 = 0;
        abstractComponentCallbacksC0308.f1117 = false;
        abstractComponentCallbacksC0308.f1125 = false;
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = abstractComponentCallbacksC0308.f1147;
        abstractComponentCallbacksC0308.f1149 = abstractComponentCallbacksC0309 != null ? abstractComponentCallbacksC0309.f1118 : null;
        abstractComponentCallbacksC0308.f1147 = null;
        abstractComponentCallbacksC0308.f1151 = bundle;
        abstractComponentCallbacksC0308.f1123 = bundle.getBundle("arguments");
    }
}
