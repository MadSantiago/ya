package p000;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥۦؒۦُ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2790 {

    /* JADX INFO: renamed from: ۥؓ */
    public final C3698 f9295;

    /* JADX INFO: renamed from: ۥؔ */
    public ArrayList f9296;

    /* JADX INFO: renamed from: ۥؖ */
    public AbstractComponentCallbacksC0308 f9297;

    /* JADX INFO: renamed from: ۥً */
    public C5002 f9299;

    /* JADX INFO: renamed from: ۥَ */
    public final C3140 f9300;

    /* JADX INFO: renamed from: ۥُ */
    public ArrayList f9301;

    /* JADX INFO: renamed from: ۥْ */
    public final C3140 f9303;

    /* JADX INFO: renamed from: ۥٓ */
    public final C3140 f9304;

    /* JADX INFO: renamed from: ۥٕ */
    public C5002 f9305;

    /* JADX INFO: renamed from: ۥٖ */
    public final C3140 f9306;

    /* JADX INFO: renamed from: ۥ٘ */
    public final RunnableC3365 f9307;

    /* JADX INFO: renamed from: ۥٙ */
    public AbstractComponentCallbacksC0308 f9308;

    /* JADX INFO: renamed from: ۥۖ */
    public C0827 f9309;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f9310;

    /* JADX INFO: renamed from: ۥۙ */
    public ArrayDeque f9311;

    /* JADX INFO: renamed from: ۥۦ */
    public boolean f9314;

    /* JADX INFO: renamed from: ۥۧ */
    public final C3223 f9315;

    /* JADX INFO: renamed from: ۦؖ */
    public boolean f9317;

    /* JADX INFO: renamed from: ۦؗ */
    public boolean f9318;

    /* JADX INFO: renamed from: ۦؙ */
    public boolean f9319;

    /* JADX INFO: renamed from: ۦُ */
    public boolean f9322;

    /* JADX INFO: renamed from: ۦٕ */
    public AbstractC0993 f9324;

    /* JADX INFO: renamed from: ۦٖ */
    public ArrayList f9325;

    /* JADX INFO: renamed from: ۦٗ */
    public final C2050 f9326;

    /* JADX INFO: renamed from: ۦٚ */
    public C5002 f9327;

    /* JADX INFO: renamed from: ۦۙ */
    public C4023 f9330;

    /* JADX INFO: renamed from: ۦۚ */
    public final ArrayList f9331;

    /* JADX INFO: renamed from: ۦۛ */
    public int f9332;

    /* JADX INFO: renamed from: ۦۜ */
    public ArrayList f9333;

    /* JADX INFO: renamed from: ۦ۟ */
    public final CopyOnWriteArrayList f9334;

    /* JADX INFO: renamed from: ۦۣ */
    public C0333 f9335;

    /* JADX INFO: renamed from: ۦۨ */
    public final C5002 f9336;

    /* JADX INFO: renamed from: ۥۣ */
    public final ArrayList f9313 = new ArrayList();

    /* JADX INFO: renamed from: ۥؗ */
    public final C1489 f9298 = new C1489(8);

    /* JADX INFO: renamed from: ۦؑ */
    public ArrayList f9316 = new ArrayList();

    /* JADX INFO: renamed from: ۥّ */
    public final LayoutInflaterFactory2C4496 f9302 = new LayoutInflaterFactory2C4496(this);

    /* JADX INFO: renamed from: ۥۜ */
    public C2177 f9312 = null;

    /* JADX INFO: renamed from: ۦٛ */
    public boolean f9328 = false;

    /* JADX INFO: renamed from: ۦِ */
    public final C0316 f9323 = new C0316(this);

    /* JADX INFO: renamed from: ۦۗ */
    public final AtomicInteger f9329 = new AtomicInteger();

    /* JADX INFO: renamed from: ۦؚ */
    public final Map f9320 = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ۦٌ */
    public final Map f9321 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [ۦؒۖٛ] */
    /* JADX WARN: Type inference failed for: r0v17, types: [ۦؒۖٛ] */
    /* JADX WARN: Type inference failed for: r0v18, types: [ۦؒۖٛ] */
    /* JADX WARN: Type inference failed for: r0v19, types: [ۦؒۖٛ] */
    public C2790() {
        Collections.synchronizedMap(new HashMap());
        this.f9331 = new ArrayList();
        this.f9336 = new C5002(this);
        this.f9334 = new CopyOnWriteArrayList();
        final int i = 0;
        this.f9303 = new InterfaceC3281(this) { // from class: ۦؒۖٛ

            /* JADX INFO: renamed from: ۥۗ */
            public final /* synthetic */ C2790 f10599;

            {
                this.f10599 = this;
            }

            @Override // p000.InterfaceC3281
            public final void accept(Object obj) {
                int i2 = i;
                C2790 c2790 = this.f10599;
                switch (i2) {
                    case 0:
                        if (c2790.m5304()) {
                            c2790.m5307(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (c2790.m5304() && num.intValue() == 80) {
                            c2790.m5301(false);
                            break;
                        }
                        break;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        C5842 c5842 = (C5842) obj;
                        if (c2790.m5304()) {
                            boolean z = c5842.f19252;
                            c2790.m5310(false);
                        }
                        break;
                    default:
                        C5882 c5882 = (C5882) obj;
                        if (c2790.m5304()) {
                            boolean z2 = c5882.f19413;
                            c2790.m5271(false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f9304 = new InterfaceC3281(this) { // from class: ۦؒۖٛ

            /* JADX INFO: renamed from: ۥۗ */
            public final /* synthetic */ C2790 f10599;

            {
                this.f10599 = this;
            }

            @Override // p000.InterfaceC3281
            public final void accept(Object obj) {
                int i3 = i2;
                C2790 c2790 = this.f10599;
                switch (i3) {
                    case 0:
                        if (c2790.m5304()) {
                            c2790.m5307(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (c2790.m5304() && num.intValue() == 80) {
                            c2790.m5301(false);
                            break;
                        }
                        break;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        C5842 c5842 = (C5842) obj;
                        if (c2790.m5304()) {
                            boolean z = c5842.f19252;
                            c2790.m5310(false);
                        }
                        break;
                    default:
                        C5882 c5882 = (C5882) obj;
                        if (c2790.m5304()) {
                            boolean z2 = c5882.f19413;
                            c2790.m5271(false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f9300 = new InterfaceC3281(this) { // from class: ۦؒۖٛ

            /* JADX INFO: renamed from: ۥۗ */
            public final /* synthetic */ C2790 f10599;

            {
                this.f10599 = this;
            }

            @Override // p000.InterfaceC3281
            public final void accept(Object obj) {
                int i4 = i3;
                C2790 c2790 = this.f10599;
                switch (i4) {
                    case 0:
                        if (c2790.m5304()) {
                            c2790.m5307(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (c2790.m5304() && num.intValue() == 80) {
                            c2790.m5301(false);
                            break;
                        }
                        break;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        C5842 c5842 = (C5842) obj;
                        if (c2790.m5304()) {
                            boolean z = c5842.f19252;
                            c2790.m5310(false);
                        }
                        break;
                    default:
                        C5882 c5882 = (C5882) obj;
                        if (c2790.m5304()) {
                            boolean z2 = c5882.f19413;
                            c2790.m5271(false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f9306 = new InterfaceC3281(this) { // from class: ۦؒۖٛ

            /* JADX INFO: renamed from: ۥۗ */
            public final /* synthetic */ C2790 f10599;

            {
                this.f10599 = this;
            }

            @Override // p000.InterfaceC3281
            public final void accept(Object obj) {
                int i5 = i4;
                C2790 c2790 = this.f10599;
                switch (i5) {
                    case 0:
                        if (c2790.m5304()) {
                            c2790.m5307(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        if (c2790.m5304() && num.intValue() == 80) {
                            c2790.m5301(false);
                            break;
                        }
                        break;
                    case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        C5842 c5842 = (C5842) obj;
                        if (c2790.m5304()) {
                            boolean z = c5842.f19252;
                            c2790.m5310(false);
                        }
                        break;
                    default:
                        C5882 c5882 = (C5882) obj;
                        if (c2790.m5304()) {
                            boolean z2 = c5882.f19413;
                            c2790.m5271(false);
                        }
                        break;
                }
            }
        };
        this.f9326 = new C2050(this);
        this.f9332 = -1;
        this.f9295 = new C3698(this);
        this.f9315 = new C3223(10);
        this.f9311 = new ArrayDeque();
        this.f9307 = new RunnableC3365(7, this);
    }

    /* JADX INFO: renamed from: ۥؔ */
    public static boolean m5259(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        if (abstractComponentCallbacksC0308 == null) {
            return true;
        }
        if (abstractComponentCallbacksC0308.f1134) {
            return abstractComponentCallbacksC0308.f1141 == null || m5259(abstractComponentCallbacksC0308.f1144);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public static HashSet m5260(C2177 c2177) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < c2177.f7191.size(); i++) {
            AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = ((C4088) c2177.f7191.get(i)).f13652;
            if (abstractComponentCallbacksC0308 != null && c2177.f7198) {
                hashSet.add(abstractComponentCallbacksC0308);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۦؗ */
    public static boolean m5261(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    /* JADX INFO: renamed from: ۦُ */
    public static boolean m5262(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        boolean zM5262 = false;
        for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 : abstractComponentCallbacksC0308.f1142.f9298.m3129()) {
            if (abstractComponentCallbacksC0309 != null) {
                zM5262 = m5262(abstractComponentCallbacksC0309);
            }
            if (zM5262) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۜ */
    public static boolean m5263(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        if (abstractComponentCallbacksC0308 == null) {
            return true;
        }
        C2790 c2790 = abstractComponentCallbacksC0308.f1141;
        return abstractComponentCallbacksC0308 == c2790.f9297 && m5263(c2790.f9308);
    }

    /* JADX INFO: renamed from: ۦ۠ */
    public static void m5264(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        if (m5261(2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0308);
        }
        if (abstractComponentCallbacksC0308.f1153) {
            abstractComponentCallbacksC0308.f1153 = false;
            abstractComponentCallbacksC0308.f1132 = !abstractComponentCallbacksC0308.f1132;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f9308;
        if (abstractComponentCallbacksC0308 != null) {
            sb.append(abstractComponentCallbacksC0308.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f9308)));
            sb.append("}");
        } else {
            C0827 c0827 = this.f9309;
            if (c0827 != null) {
                sb.append(c0827.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f9309)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final boolean m5265(boolean z) {
        boolean zMo544;
        ArrayList arrayList;
        C2177 c2177;
        m5266(z);
        if (!this.f9328 && (c2177 = this.f9312) != null) {
            c2177.f7188 = false;
            c2177.m4233();
            if (m5261(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f9312 + " as part of execPendingActions for actions " + this.f9313);
            }
            this.f9312.m4230(false, false);
            this.f9313.add(0, this.f9312);
            Iterator it = this.f9312.f7191.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = ((C4088) it.next()).f13652;
                if (abstractComponentCallbacksC0308 != null) {
                    abstractComponentCallbacksC0308.f1112 = false;
                }
            }
            this.f9312 = null;
        }
        boolean z2 = false;
        while (true) {
            ArrayList arrayList2 = this.f9325;
            ArrayList arrayList3 = this.f9296;
            synchronized (this.f9313) {
                if (this.f9313.isEmpty()) {
                    zMo544 = false;
                } else {
                    try {
                        int size = this.f9313.size();
                        int i = 0;
                        zMo544 = false;
                        while (true) {
                            arrayList = this.f9313;
                            if (i >= size) {
                                break;
                            }
                            zMo544 |= ((InterfaceC5854) arrayList.get(i)).mo544(arrayList2, arrayList3);
                            i++;
                            throw th;
                        }
                        arrayList.clear();
                        this.f9309.f2928.removeCallbacks(this.f9307);
                    } catch (Throwable th) {
                        this.f9313.clear();
                        this.f9309.f2928.removeCallbacks(this.f9307);
                        throw th;
                    }
                }
            }
            if (!zMo544) {
                m5297();
                m5311();
                ((HashMap) this.f9298.f5057).values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.f9310 = true;
            try {
                m5281(this.f9325, this.f9296);
                m5295();
            } catch (Throwable th2) {
                m5295();
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final void m5266(boolean z) {
        if (this.f9310) {
            C1078.m2276("FragmentManager is already executing transactions");
            return;
        }
        if (this.f9309 == null) {
            if (this.f9318) {
                C1078.m2276("FragmentManager has been destroyed");
                return;
            } else {
                C1078.m2276("FragmentManager has not been attached to a host.");
                return;
            }
        }
        if (Looper.myLooper() != this.f9309.f2928.getLooper()) {
            C1078.m2276("Must be called from main thread of fragment host");
            return;
        }
        if (!z && (this.f9317 || this.f9314)) {
            C1078.m2276("Can not perform this action after onSaveInstanceState");
        } else if (this.f9325 == null) {
            this.f9325 = new ArrayList();
            this.f9296 = new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m5267(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        if (m5261(2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0308);
        }
        if (abstractComponentCallbacksC0308.f1124) {
            abstractComponentCallbacksC0308.f1124 = false;
            if (abstractComponentCallbacksC0308.f1125) {
                return;
            }
            this.f9298.m3115(abstractComponentCallbacksC0308);
            if (m5261(2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0308);
            }
            if (m5262(abstractComponentCallbacksC0308)) {
                this.f9319 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۥؙ */
    public final void m5268() {
        synchronized (this.f9313) {
            try {
                if (this.f9313.size() == 1) {
                    this.f9309.f2928.removeCallbacks(this.f9307);
                    this.f9309.f2928.post(this.f9307);
                    m5297();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥؚ */
    public final Bundle m5269() {
        int i;
        ArrayList arrayList;
        C4983[] c4983Arr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        m5306();
        m5303();
        m5265(true);
        this.f9317 = true;
        this.f9335.f1249 = true;
        C1489 c1489 = this.f9298;
        c1489.getClass();
        HashMap map = (HashMap) c1489.f5057;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C1239 c1239 = (C1239) it.next();
            if (c1239 != null) {
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = c1239.f4258;
                String str = abstractComponentCallbacksC0308.f1118;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = c1239.f4258;
                if (abstractComponentCallbacksC0309.f1155 == -1 && (bundle = abstractComponentCallbacksC0309.f1151) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable("state", new C5003(abstractComponentCallbacksC0309));
                if (abstractComponentCallbacksC0309.f1155 > 0) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC0309.mo656(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    c1239.f4261.m8413(abstractComponentCallbacksC0309, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC0309.f1129.m4402(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleM5269 = abstractComponentCallbacksC0309.f1142.m5269();
                    if (!bundleM5269.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleM5269);
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0309.f1120;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC0309.f1121;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC0309.f1123;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                c1489.m3119(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC0308.f1118);
                if (m5261(2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0308 + ": " + abstractComponentCallbacksC0308.f1151);
                }
            }
        }
        HashMap map2 = (HashMap) this.f9298.f5058;
        if (!map2.isEmpty()) {
            C1489 c14810 = this.f9298;
            synchronized (((ArrayList) c14810.f5059)) {
                try {
                    if (((ArrayList) c14810.f5059).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c14810.f5059).size());
                        for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC03010 : (ArrayList) c14810.f5059) {
                            arrayList.add(abstractComponentCallbacksC03010.f1118);
                            if (m5261(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC03010.f1118 + "): " + abstractComponentCallbacksC03010);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = this.f9316.size();
            if (size > 0) {
                c4983Arr = new C4983[size];
                for (i = 0; i < size; i++) {
                    c4983Arr[i] = new C4983((C2177) this.f9316.get(i));
                    if (m5261(2)) {
                        StringBuilder sbM8680 = AbstractC5078.m8680(i, "saveAllState: adding back stack #", ": ");
                        sbM8680.append(this.f9316.get(i));
                        Log.v("FragmentManager", sbM8680.toString());
                    }
                }
            } else {
                c4983Arr = null;
            }
            C4290 c4290 = new C4290();
            c4290.f14181 = null;
            ArrayList arrayList3 = new ArrayList();
            c4290.f14184 = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            c4290.f14185 = arrayList4;
            c4290.f14188 = arrayList2;
            c4290.f14187 = arrayList;
            c4290.f14182 = c4983Arr;
            c4290.f14183 = this.f9329.get();
            AbstractComponentCallbacksC0308 abstractComponentCallbacksC03011 = this.f9297;
            if (abstractComponentCallbacksC03011 != null) {
                c4290.f14181 = abstractComponentCallbacksC03011.f1118;
            }
            arrayList3.addAll(this.f9320.keySet());
            arrayList4.addAll(this.f9320.values());
            c4290.f14186 = new ArrayList(this.f9311);
            bundle2.putParcelable("state", c4290);
            for (String str2 : this.f9321.keySet()) {
                bundle2.putBundle(AbstractC3761.m6628("result_", str2), (Bundle) this.f9321.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(AbstractC3761.m6628("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (m5261(2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return bundle2;
        }
        return bundle2;
    }

    /* JADX INFO: renamed from: ۥً */
    public final AbstractComponentCallbacksC0308 m5270(int i) {
        C1489 c1489 = this.f9298;
        ArrayList arrayList = (ArrayList) c1489.f5059;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = (AbstractComponentCallbacksC0308) arrayList.get(size);
            if (abstractComponentCallbacksC0308 != null && abstractComponentCallbacksC0308.f1146 == i) {
                return abstractComponentCallbacksC0308;
            }
        }
        for (C1239 c1239 : ((HashMap) c1489.f5057).values()) {
            if (c1239 != null) {
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = c1239.f4258;
                if (abstractComponentCallbacksC0309.f1146 == i) {
                    return abstractComponentCallbacksC0309;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final void m5271(boolean z) {
        if (z && this.f9309 != null) {
            m5284(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 : this.f9298.m3106()) {
            if (abstractComponentCallbacksC0308 != null && z) {
                abstractComponentCallbacksC0308.f1142.m5271(true);
            }
        }
    }

    /* JADX INFO: renamed from: ۥُ */
    public final HashSet m5272() {
        C4526 c4526;
        HashSet hashSet = new HashSet();
        Iterator it = this.f9298.m3121().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C1239) it.next()).f4258.f1127;
            if (viewGroup != null) {
                m5298();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C4526) {
                    c4526 = (C4526) tag;
                } else {
                    c4526 = new C4526(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c4526);
                }
                hashSet.add(c4526);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۥِ */
    public final void m5273() {
        for (C1239 c1239 : this.f9298.m3121()) {
            AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = c1239.f4258;
            if (abstractComponentCallbacksC0308.f1131) {
                if (this.f9310) {
                    this.f9322 = true;
                } else {
                    abstractComponentCallbacksC0308.f1131 = false;
                    c1239.m2623();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥّ */
    public final HashSet m5274(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        C4526 c4526;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((C2177) arrayList.get(i)).f7191.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = ((C4088) it.next()).f13652;
                if (abstractComponentCallbacksC0308 != null && (viewGroup = abstractComponentCallbacksC0308.f1127) != null) {
                    m5298();
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof C4526) {
                        c4526 = (C4526) tag;
                    } else {
                        c4526 = new C4526(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, c4526);
                    }
                    hashSet.add(c4526);
                }
            }
            i++;
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final void m5275() {
        if (this.f9332 < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 : this.f9298.m3106()) {
            if (abstractComponentCallbacksC0308 != null && !abstractComponentCallbacksC0308.f1153) {
                abstractComponentCallbacksC0308.f1142.m5275();
            }
        }
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final void m5276(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        if (abstractComponentCallbacksC0308 != null) {
            if (abstractComponentCallbacksC0308 != this.f9298.m3170(abstractComponentCallbacksC0308.f1118)) {
                return;
            }
            abstractComponentCallbacksC0308.f1141.getClass();
            boolean zM5263 = m5263(abstractComponentCallbacksC0308);
            Boolean bool = abstractComponentCallbacksC0308.f1145;
            if (bool == null || bool.booleanValue() != zM5263) {
                abstractComponentCallbacksC0308.f1145 = Boolean.valueOf(zM5263);
                C2790 c2790 = abstractComponentCallbacksC0308.f1142;
                c2790.m5297();
                c2790.m5276(c2790.f9297);
            }
        }
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final boolean m5277() {
        if (this.f9332 < 1) {
            return false;
        }
        boolean z = false;
        for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 : this.f9298.m3106()) {
            if (abstractComponentCallbacksC0308 != null && m5259(abstractComponentCallbacksC0308)) {
                if (!abstractComponentCallbacksC0308.f1153 ? abstractComponentCallbacksC0308.f1142.m5277() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ٘ */
    public final void m5278() {
        if (this.f9309 == null) {
            return;
        }
        this.f9317 = false;
        this.f9314 = false;
        this.f9335.f1249 = false;
        for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 : this.f9298.m3106()) {
            if (abstractComponentCallbacksC0308 != null) {
                abstractComponentCallbacksC0308.f1142.m5278();
            }
        }
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final void m5279(InterfaceC5854 interfaceC5854, boolean z) {
        if (!z) {
            if (this.f9309 == null) {
                if (this.f9318) {
                    C1078.m2276("FragmentManager has been destroyed");
                    return;
                } else {
                    C1078.m2276("FragmentManager has not been attached to a host.");
                    return;
                }
            }
            if (this.f9317 || this.f9314) {
                C1078.m2276("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f9313) {
            try {
                if (this.f9309 == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f9313.add(interfaceC5854);
                    m5268();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۥٛ */
    public final boolean m5280() {
        m5265(false);
        m5266(true);
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f9297;
        if (abstractComponentCallbacksC0308 != null && abstractComponentCallbacksC0308.m659().m5280()) {
            return true;
        }
        boolean zM5290 = m5290(this.f9325, this.f9296, -1, 0);
        if (zM5290) {
            this.f9310 = true;
            try {
                m5281(this.f9325, this.f9296);
                m5295();
            } catch (Throwable th) {
                m5295();
                throw th;
            }
        }
        m5297();
        m5311();
        ((HashMap) this.f9298.f5057).values().removeAll(Collections.singleton(null));
        return zM5290;
    }

    /* JADX INFO: renamed from: ۥٝ */
    public final void m5281(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            C1078.m2276("Internal error with the back stack records");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C2177) arrayList.get(i)).f7201) {
                if (i2 != i) {
                    m5293(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C2177) arrayList.get(i2)).f7201) {
                        i2++;
                    }
                }
                m5293(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m5293(arrayList, arrayList2, i2, size);
        }
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final void m5282(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2;
        String str3 = str + "    ";
        C1489 c1489 = this.f9298;
        ArrayList arrayList = (ArrayList) c1489.f5059;
        String str4 = str + "    ";
        HashMap map = (HashMap) c1489.f5057;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C1239 c1239 : map.values()) {
                printWriter.print(str);
                if (c1239 != null) {
                    AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = c1239.f4258;
                    printWriter.println(abstractComponentCallbacksC0308);
                    printWriter.print(str4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0308.f1146));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0308.f1113));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0308.f1150);
                    printWriter.print(str4);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0308.f1155);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0308.f1118);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0308.f1143);
                    printWriter.print(str4);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0308.f1125);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0308.f1114);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0308.f1137);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0308.f1117);
                    printWriter.print(str4);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0308.f1153);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0308.f1124);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0308.f1134);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0308.f1126);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0308.f1116);
                    if (abstractComponentCallbacksC0308.f1141 != null) {
                        printWriter.print(str4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0308.f1141);
                    }
                    if (abstractComponentCallbacksC0308.f1136 != null) {
                        printWriter.print(str4);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0308.f1136);
                    }
                    if (abstractComponentCallbacksC0308.f1144 != null) {
                        printWriter.print(str4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0308.f1144);
                    }
                    if (abstractComponentCallbacksC0308.f1123 != null) {
                        printWriter.print(str4);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0308.f1123);
                    }
                    if (abstractComponentCallbacksC0308.f1151 != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0308.f1151);
                    }
                    if (abstractComponentCallbacksC0308.f1120 != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0308.f1120);
                    }
                    if (abstractComponentCallbacksC0308.f1121 != null) {
                        printWriter.print(str4);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0308.f1121);
                    }
                    Object objM3170 = abstractComponentCallbacksC0308.f1147;
                    if (objM3170 == null) {
                        C2790 c2790 = abstractComponentCallbacksC0308.f1141;
                        objM3170 = (c2790 == null || (str2 = abstractComponentCallbacksC0308.f1149) == null) ? null : c2790.f9298.m3170(str2);
                    }
                    if (objM3170 != null) {
                        printWriter.print(str4);
                        printWriter.print("mTarget=");
                        printWriter.print(objM3170);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0308.f1128);
                    }
                    printWriter.print(str4);
                    printWriter.print("mPopDirection=");
                    C4613 c4613 = abstractComponentCallbacksC0308.f1115;
                    printWriter.println(c4613 == null ? false : c4613.f15235);
                    C4613 c4614 = abstractComponentCallbacksC0308.f1115;
                    if ((c4614 == null ? 0 : c4614.f15233) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getEnterAnim=");
                        C4613 c4615 = abstractComponentCallbacksC0308.f1115;
                        printWriter.println(c4615 == null ? 0 : c4615.f15233);
                    }
                    C4613 c4616 = abstractComponentCallbacksC0308.f1115;
                    if ((c4616 == null ? 0 : c4616.f15230) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getExitAnim=");
                        C4613 c4617 = abstractComponentCallbacksC0308.f1115;
                        printWriter.println(c4617 == null ? 0 : c4617.f15230);
                    }
                    C4613 c4618 = abstractComponentCallbacksC0308.f1115;
                    if ((c4618 == null ? 0 : c4618.f15236) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopEnterAnim=");
                        C4613 c4619 = abstractComponentCallbacksC0308.f1115;
                        printWriter.println(c4619 == null ? 0 : c4619.f15236);
                    }
                    C4613 c46110 = abstractComponentCallbacksC0308.f1115;
                    if ((c46110 == null ? 0 : c46110.f15231) != 0) {
                        printWriter.print(str4);
                        printWriter.print("getPopExitAnim=");
                        C4613 c46111 = abstractComponentCallbacksC0308.f1115;
                        printWriter.println(c46111 == null ? 0 : c46111.f15231);
                    }
                    if (abstractComponentCallbacksC0308.f1127 != null) {
                        printWriter.print(str4);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0308.f1127);
                    }
                    C0827 c0827 = abstractComponentCallbacksC0308.f1136;
                    if ((c0827 != null ? c0827.f2924 : null) != null) {
                        C3369.m6127(abstractComponentCallbacksC0308).m6140(str4, printWriter);
                    }
                    printWriter.print(str4);
                    printWriter.println("Child " + abstractComponentCallbacksC0308.f1142 + ":");
                    abstractComponentCallbacksC0308.f1142.m5282(str4.concat("  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = (AbstractComponentCallbacksC0308) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0309.toString());
            }
        }
        ArrayList arrayList2 = this.f9301;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC03010 = (AbstractComponentCallbacksC0308) this.f9301.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC03010.toString());
            }
        }
        int size3 = this.f9316.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                C2177 c2177 = (C2177) this.f9316.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c2177.toString());
                c2177.m4234(str3, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f9329.get());
        synchronized (this.f9313) {
            try {
                int size4 = this.f9313.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC5854) this.f9313.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f9309);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f9324);
        if (this.f9308 != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f9308);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f9332);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f9317);
        printWriter.print(" mStopped=");
        printWriter.print(this.f9314);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f9318);
        if (this.f9319) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f9319);
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m5283(C0827 c0827, AbstractC0993 abstractC0993, AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        C0333 c0333;
        if (this.f9309 != null) {
            C1078.m2276("Already attached");
            return;
        }
        this.f9309 = c0827;
        this.f9324 = abstractC0993;
        this.f9308 = abstractComponentCallbacksC0308;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9334;
        if (abstractComponentCallbacksC0308 != null) {
            copyOnWriteArrayList.add(new C3694(abstractComponentCallbacksC0308));
        } else if (c0827 != null) {
            copyOnWriteArrayList.add(c0827);
        }
        if (this.f9308 != null) {
            m5297();
        }
        if (c0827 != null) {
            C4023 c4023M3179 = c0827.f2926.m3179();
            this.f9330 = c4023M3179;
            c4023M3179.m7197(abstractComponentCallbacksC0308 != null ? abstractComponentCallbacksC0308 : c0827, this.f9323);
        }
        int i = 0;
        if (abstractComponentCallbacksC0308 != null) {
            C0333 c0334 = abstractComponentCallbacksC0308.f1141.f9335;
            HashMap map = c0334.f1244;
            c0333 = (C0333) map.get(abstractComponentCallbacksC0308.f1118);
            if (c0333 == null) {
                c0333 = new C0333(c0334.f1245);
                map.put(abstractComponentCallbacksC0308.f1118, c0333);
            }
            this.f9335 = c0333;
        } else if (c0827 != null) {
            C1489 c1489 = new C1489(c0827.f2926.mo651(), C0333.f1243, C4390.f14468);
            C3131 c3131M8557 = AbstractC5041.m8557(C0333.class);
            String strM5776 = c3131M8557.m5776();
            if (strM5776 == null) {
                C1078.m2272("Local and anonymous classes can not be ViewModels");
                return;
            } else {
                c0333 = (C0333) c1489.m3136(c3131M8557, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM5776));
                this.f9335 = c0333;
            }
        } else {
            c0333 = new C0333(false);
            this.f9335 = c0333;
        }
        C0333 c0335 = c0333;
        int i2 = 1;
        c0333.f1249 = this.f9317 || this.f9314;
        this.f9298.f5056 = c0335;
        C0827 c0828 = this.f9309;
        if (c0828 != null && abstractComponentCallbacksC0308 == null) {
            C2346 c2346Mo648 = c0828.mo648();
            c2346Mo648.m4413("android:support:fragments", new C5444(3, this));
            Bundle bundleM4415 = c2346Mo648.m4415("android:support:fragments");
            if (bundleM4415 != null) {
                m5287(bundleM4415);
            }
        }
        C0827 c0829 = this.f9309;
        if (c0829 != null) {
            C0331 c0331 = c0829.f2926.f5102;
            String strConcat = "FragmentManager:".concat(abstractComponentCallbacksC0308 != null ? AbstractC3761.m6621(new StringBuilder(), abstractComponentCallbacksC0308.f1118, ":") : "");
            this.f9299 = c0331.m761(strConcat.concat("StartActivityForResult"), new C1943(i2), new C4228(26, this));
            this.f9327 = c0331.m761(strConcat.concat("StartIntentSenderForResult"), new C1943(2), new C4758(this, i2));
            this.f9305 = c0331.m761(strConcat.concat("RequestPermissions"), new C1943(i), new C4758(this, i));
        }
        C0827 c08210 = this.f9309;
        if (c08210 != null) {
            c08210.f2926.m3178(this.f9303);
        }
        C0827 c08211 = this.f9309;
        if (c08211 != null) {
            c08211.f2926.f5099.add(this.f9304);
        }
        C0827 c08212 = this.f9309;
        if (c08212 != null) {
            c08212.f2926.f5087.add(this.f9300);
        }
        C0827 c08213 = this.f9309;
        if (c08213 != null) {
            c08213.f2926.f5086.add(this.f9306);
        }
        C0827 c08214 = this.f9309;
        if (c08214 == null || abstractComponentCallbacksC0308 != null) {
            return;
        }
        C2808 c2808 = c08214.f2926.f5090;
        ((CopyOnWriteArrayList) c2808.f9376).add(this.f9326);
        ((Runnable) c2808.f9378).run();
    }

    /* JADX INFO: renamed from: ۥۘ */
    public final void m5284(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C2814());
        C0827 c0827 = this.f9309;
        if (c0827 == null) {
            try {
                m5282("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw illegalStateException;
            }
        }
        try {
            c0827.f2926.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw illegalStateException;
        }
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final ViewGroup m5285(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        ViewGroup viewGroup = abstractComponentCallbacksC0308.f1127;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0308.f1113 <= 0 || !this.f9324.mo1306()) {
            return null;
        }
        View viewMo1305 = this.f9324.mo1305(abstractComponentCallbacksC0308.f1113);
        if (viewMo1305 instanceof ViewGroup) {
            return (ViewGroup) viewMo1305;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m5286(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        if (m5261(2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0308);
        }
        if (abstractComponentCallbacksC0308.f1124) {
            return;
        }
        abstractComponentCallbacksC0308.f1124 = true;
        if (abstractComponentCallbacksC0308.f1125) {
            if (m5261(2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0308);
            }
            C1489 c1489 = this.f9298;
            synchronized (((ArrayList) c1489.f5059)) {
                ((ArrayList) c1489.f5059).remove(abstractComponentCallbacksC0308);
            }
            abstractComponentCallbacksC0308.f1125 = false;
            if (m5262(abstractComponentCallbacksC0308)) {
                this.f9319 = true;
            }
            m5294(abstractComponentCallbacksC0308);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m5287(Bundle bundle) {
        C5002 c5002;
        int i;
        boolean z;
        int i2;
        C1239 c1239;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f9309.f2924.getClassLoader());
                this.f9321.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f9309.f2924.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C1489 c1489 = this.f9298;
        HashMap map2 = (HashMap) c1489.f5058;
        HashMap map3 = (HashMap) c1489.f5057;
        map2.clear();
        map2.putAll(map);
        C4290 c4290 = (C4290) bundle.getParcelable("state");
        if (c4290 == null) {
            return;
        }
        map3.clear();
        Iterator it = c4290.f14188.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c5002 = this.f9336;
            i = 2;
            if (!zHasNext) {
                break;
            }
            Bundle bundleM3119 = c1489.m3119((String) it.next(), null);
            if (bundleM3119 != null) {
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = (AbstractComponentCallbacksC0308) this.f9335.f1247.get(((C5003) bundleM3119.getParcelable("state")).f16566);
                if (abstractComponentCallbacksC0308 != null) {
                    if (m5261(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0308);
                    }
                    c1239 = new C1239(c5002, c1489, abstractComponentCallbacksC0308, bundleM3119);
                } else {
                    c1239 = new C1239(this.f9336, this.f9298, this.f9309.f2924.getClassLoader(), m5299(), bundleM3119);
                }
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = c1239.f4258;
                abstractComponentCallbacksC0309.f1151 = bundleM3119;
                abstractComponentCallbacksC0309.f1141 = this;
                if (m5261(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0309.f1118 + "): " + abstractComponentCallbacksC0309);
                }
                c1239.m2621(this.f9309.f2924.getClassLoader());
                c1489.m3124(c1239);
                c1239.f4259 = this.f9332;
            }
        }
        C0333 c0333 = this.f9335;
        c0333.getClass();
        Iterator it2 = new ArrayList(c0333.f1247.values()).iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            AbstractComponentCallbacksC0308 abstractComponentCallbacksC03010 = (AbstractComponentCallbacksC0308) it2.next();
            if (map3.get(abstractComponentCallbacksC03010.f1118) == null) {
                if (m5261(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC03010 + " that was not found in the set of active Fragments " + c4290.f14188);
                }
                this.f9335.m767(abstractComponentCallbacksC03010);
                abstractComponentCallbacksC03010.f1141 = this;
                C1239 c12310 = new C1239(c5002, c1489, abstractComponentCallbacksC03010);
                c12310.f4259 = 1;
                c12310.m2623();
                abstractComponentCallbacksC03010.f1114 = true;
                c12310.m2623();
            }
        }
        ArrayList<String> arrayList = c4290.f14187;
        ((ArrayList) c1489.f5059).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308M3170 = c1489.m3170(str3);
                if (abstractComponentCallbacksC0308M3170 == null) {
                    C1078.m2276(AbstractC3761.m6629("No instantiated fragment for (", str3, ")"));
                    return;
                }
                if (m5261(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC0308M3170);
                }
                c1489.m3115(abstractComponentCallbacksC0308M3170);
            }
        }
        if (c4290.f14182 != null) {
            this.f9316 = new ArrayList(c4290.f14182.length);
            int i3 = 0;
            while (true) {
                C4983[] c4983Arr = c4290.f14182;
                if (i3 >= c4983Arr.length) {
                    break;
                }
                C4983 c4983 = c4983Arr[i3];
                ArrayList arrayList2 = c4983.f16489;
                C2177 c2177 = new C2177(this);
                int[] iArr = c4983.f16490;
                int i4 = 0;
                int i5 = 0;
                while (i4 < iArr.length) {
                    C4088 c4088 = new C4088();
                    int i6 = i4 + 1;
                    int i7 = i;
                    c4088.f13654 = iArr[i4];
                    if (m5261(i7)) {
                        Log.v("FragmentManager", "Instantiate " + c2177 + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    c4088.f13653 = EnumC0458.values()[c4983.f16480[i5]];
                    c4088.f13656 = EnumC0458.values()[c4983.f16481[i5]];
                    int i8 = i4 + 2;
                    c4088.f13649 = iArr[i6] != 0 ? z : false;
                    int i9 = iArr[i8];
                    c4088.f13655 = i9;
                    int i10 = iArr[i4 + 3];
                    c4088.f13650 = i10;
                    int i11 = i4 + 5;
                    int i12 = iArr[i4 + 4];
                    c4088.f13651 = i12;
                    i4 += 6;
                    int[] iArr2 = iArr;
                    int i13 = iArr2[i11];
                    c4088.f13657 = i13;
                    c2177.f7189 = i9;
                    c2177.f7183 = i10;
                    c2177.f7192 = i12;
                    c2177.f7185 = i13;
                    c2177.m4232(c4088);
                    i5++;
                    i = i7;
                    iArr = iArr2;
                    z = true;
                }
                int i14 = i;
                c2177.f7186 = c4983.f16479;
                c2177.f7190 = c4983.f16482;
                c2177.f7198 = true;
                c2177.f7196 = c4983.f16488;
                c2177.f7195 = c4983.f16484;
                c2177.f7197 = c4983.f16486;
                c2177.f7193 = c4983.f16483;
                c2177.f7194 = c4983.f16478;
                c2177.f7199 = c4983.f16477;
                c2177.f7201 = c4983.f16485;
                c2177.f7184 = c4983.f16487;
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    String str4 = (String) arrayList2.get(i15);
                    if (str4 != null) {
                        ((C4088) c2177.f7191.get(i15)).f13652 = c1489.m3170(str4);
                    }
                }
                c2177.m4229(1);
                if (m5261(i14)) {
                    StringBuilder sbM8680 = AbstractC5078.m8680(i3, "restoreAllState: back stack #", " (index ");
                    sbM8680.append(c2177.f7184);
                    sbM8680.append("): ");
                    sbM8680.append(c2177);
                    Log.v("FragmentManager", sbM8680.toString());
                    PrintWriter printWriter = new PrintWriter(new C2814());
                    c2177.m4234("  ", printWriter, false);
                    printWriter.close();
                }
                this.f9316.add(c2177);
                i3++;
                i = i14;
                z = true;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.f9316 = new ArrayList();
        }
        this.f9329.set(c4290.f14183);
        String str5 = c4290.f14181;
        if (str5 != null) {
            AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308M3171 = c1489.m3170(str5);
            this.f9297 = abstractComponentCallbacksC0308M3171;
            m5276(abstractComponentCallbacksC0308M3171);
        }
        ArrayList arrayList3 = c4290.f14184;
        if (arrayList3 != null) {
            for (int i16 = i2; i16 < arrayList3.size(); i16++) {
                this.f9320.put((String) arrayList3.get(i16), (C2964) c4290.f14185.get(i16));
            }
        }
        this.f9311 = new ArrayDeque(c4290.f14186);
    }

    /* JADX INFO: renamed from: ۥۡ */
    public final void m5288(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, boolean z) {
        ViewGroup viewGroupM5285 = m5285(abstractComponentCallbacksC0308);
        if (viewGroupM5285 == null || !(viewGroupM5285 instanceof C5189)) {
            return;
        }
        ((C5189) viewGroupM5285).setDrawDisappearingViewsLast(!z);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final C1239 m5289(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        String str = abstractComponentCallbacksC0308.f1135;
        if (str != null) {
            AbstractC3787.m6702(abstractComponentCallbacksC0308, str);
        }
        if (m5261(2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0308);
        }
        C1239 c1239M5309 = m5309(abstractComponentCallbacksC0308);
        abstractComponentCallbacksC0308.f1141 = this;
        C1489 c1489 = this.f9298;
        c1489.m3124(c1239M5309);
        if (!abstractComponentCallbacksC0308.f1124) {
            c1489.m3115(abstractComponentCallbacksC0308);
            abstractComponentCallbacksC0308.f1114 = false;
            abstractComponentCallbacksC0308.f1132 = false;
            if (m5262(abstractComponentCallbacksC0308)) {
                this.f9319 = true;
            }
        }
        return c1239M5309;
    }

    /* JADX INFO: renamed from: ۥۤ */
    public final boolean m5290(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.f9316.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.f9316.size() - 1;
            } else {
                int size2 = this.f9316.size() - 1;
                while (size2 >= 0) {
                    C2177 c2177 = (C2177) this.f9316.get(size2);
                    if (i >= 0 && i == c2177.f7184) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    size = size2;
                } else if (z) {
                    size = size2;
                    while (size > 0) {
                        C2177 c2178 = (C2177) this.f9316.get(size - 1);
                        if (i < 0 || i != c2178.f7184) {
                            break;
                        }
                        size--;
                    }
                } else if (size2 != this.f9316.size() - 1) {
                    size = size2 + 1;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f9316.size() - 1; size3 >= size; size3--) {
            arrayList.add((C2177) this.f9316.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥۥ */
    public final void m5291(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        if (abstractComponentCallbacksC0308 != null) {
            if (abstractComponentCallbacksC0308 != this.f9298.m3170(abstractComponentCallbacksC0308.f1118) || (abstractComponentCallbacksC0308.f1136 != null && abstractComponentCallbacksC0308.f1141 != this)) {
                C2316.m4359("Fragment ", abstractComponentCallbacksC0308, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = this.f9297;
        this.f9297 = abstractComponentCallbacksC0308;
        m5276(abstractComponentCallbacksC0309);
        m5276(this.f9297);
    }

    /* JADX INFO: renamed from: ۥۦ */
    public final void m5292(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        if (m5261(2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0308);
        }
        if (abstractComponentCallbacksC0308.f1153) {
            return;
        }
        abstractComponentCallbacksC0308.f1153 = true;
        abstractComponentCallbacksC0308.f1132 = true ^ abstractComponentCallbacksC0308.f1132;
        m5294(abstractComponentCallbacksC0308);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x022f A[PHI: r15
  0x022f: PHI (r15v20 char) = (r15v19 char), (r15v22 char) binds: [B:105:0x021c, B:109:0x0226] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:25:0x0074  */
    /* JADX WARN: Code duplicated, block: B:64:0x0176  */
    /* JADX INFO: renamed from: ۥۧ */
    public final void m5293(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ArrayList arrayList3;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        int i5 = i;
        C1489 c1489 = this.f9298;
        ArrayList arrayList4 = this.f9331;
        boolean z4 = ((C2177) arrayList.get(i5)).f7201;
        ArrayList arrayList5 = this.f9333;
        if (arrayList5 == null) {
            this.f9333 = new ArrayList();
        } else {
            arrayList5.clear();
        }
        this.f9333.addAll(c1489.m3106());
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f9297;
        int i6 = i5;
        boolean z5 = false;
        while (i6 < i2) {
            C2177 c2177 = (C2177) arrayList.get(i6);
            boolean zBooleanValue = ((Boolean) arrayList2.get(i6)).booleanValue();
            ArrayList arrayList6 = this.f9333;
            if (zBooleanValue) {
                arrayList3 = arrayList4;
                z = z4;
                i3 = i6;
                z2 = z5;
                int i7 = 1;
                ArrayList arrayList7 = c2177.f7191;
                int size = arrayList7.size() - 1;
                while (size >= 0) {
                    C4088 c4088 = (C4088) arrayList7.get(size);
                    int i8 = c4088.f13654;
                    if (i8 != i7) {
                        if (i8 != 3) {
                            switch (i8) {
                                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                                    arrayList6.add(c4088.f13652);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC0308 = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0308 = c4088.f13652;
                                    break;
                                case 10:
                                    c4088.f13656 = c4088.f13653;
                                    break;
                            }
                        } else {
                            arrayList6.add(c4088.f13652);
                        }
                        size--;
                        i7 = 1;
                    }
                    arrayList6.remove(c4088.f13652);
                    size--;
                    i7 = 1;
                }
            } else {
                ArrayList arrayList8 = c2177.f7191;
                int i9 = 0;
                while (i9 < arrayList8.size()) {
                    C4088 c4089 = (C4088) arrayList8.get(i9);
                    boolean z6 = z4;
                    int i10 = c4089.f13654;
                    int i11 = i6;
                    int i12 = 1;
                    if (i10 != 1) {
                        z3 = z5;
                        if (i10 != 2) {
                            if (i10 == 3 || i10 == 6) {
                                arrayList6.remove(c4089.f13652);
                                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = c4089.f13652;
                                if (abstractComponentCallbacksC0309 == abstractComponentCallbacksC0308) {
                                    arrayList8.add(i9, new C4088(9, abstractComponentCallbacksC0309));
                                    i9++;
                                    abstractComponentCallbacksC0308 = null;
                                }
                            } else if (i10 == 7) {
                                i12 = 1;
                            } else if (i10 == 8) {
                                arrayList8.add(i9, new C4088(9, abstractComponentCallbacksC0308, 0));
                                c4089.f13649 = true;
                                i9++;
                                abstractComponentCallbacksC0308 = c4089.f13652;
                            }
                            i12 = 1;
                        } else {
                            AbstractComponentCallbacksC0308 abstractComponentCallbacksC03010 = c4089.f13652;
                            int i13 = abstractComponentCallbacksC03010.f1113;
                            int size2 = arrayList6.size() - 1;
                            boolean z7 = false;
                            while (size2 >= 0) {
                                int i14 = size2;
                                AbstractComponentCallbacksC0308 abstractComponentCallbacksC03011 = (AbstractComponentCallbacksC0308) arrayList6.get(size2);
                                ArrayList arrayList9 = arrayList4;
                                if (abstractComponentCallbacksC03011.f1113 != i13) {
                                    i13 = i13;
                                } else if (abstractComponentCallbacksC03011 == abstractComponentCallbacksC03010) {
                                    i13 = i13;
                                    z7 = true;
                                } else {
                                    if (abstractComponentCallbacksC03011 == abstractComponentCallbacksC0308) {
                                        arrayList8.add(i9, new C4088(9, abstractComponentCallbacksC03011, 0));
                                        i9++;
                                        i4 = 0;
                                        abstractComponentCallbacksC0308 = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    C4088 c40810 = new C4088(3, abstractComponentCallbacksC03011, i4);
                                    c40810.f13655 = c4089.f13655;
                                    c40810.f13651 = c4089.f13651;
                                    c40810.f13650 = c4089.f13650;
                                    c40810.f13657 = c4089.f13657;
                                    arrayList8.add(i9, c40810);
                                    arrayList6.remove(abstractComponentCallbacksC03011);
                                    i9++;
                                    abstractComponentCallbacksC0308 = abstractComponentCallbacksC0308;
                                }
                                size2 = i14 - 1;
                                i13 = i13;
                                arrayList4 = arrayList9;
                            }
                            arrayList4 = arrayList4;
                            i12 = 1;
                            if (z7) {
                                arrayList8.remove(i9);
                                i9--;
                            } else {
                                c4089.f13654 = 1;
                                c4089.f13649 = true;
                                arrayList6.add(abstractComponentCallbacksC03010);
                            }
                        }
                        i9 += i12;
                        z4 = z6;
                        i6 = i11;
                        z5 = z3;
                        arrayList4 = arrayList4;
                    } else {
                        z3 = z5;
                    }
                    arrayList4 = arrayList4;
                    arrayList6.add(c4089.f13652);
                    i9 += i12;
                    z4 = z6;
                    i6 = i11;
                    z5 = z3;
                    arrayList4 = arrayList4;
                }
                arrayList3 = arrayList4;
                z = z4;
                i3 = i6;
                z2 = z5;
            }
            z5 = z2 || c2177.f7198;
            i6 = i3 + 1;
            z4 = z;
            arrayList4 = arrayList3;
        }
        ArrayList arrayList10 = arrayList4;
        boolean z8 = z4;
        boolean z9 = z5;
        this.f9333.clear();
        if (!z8 && this.f9332 >= 1) {
            for (int i15 = i5; i15 < i2; i15++) {
                Iterator it = ((C2177) arrayList.get(i15)).f7191.iterator();
                while (it.hasNext()) {
                    AbstractComponentCallbacksC0308 abstractComponentCallbacksC03012 = ((C4088) it.next()).f13652;
                    if (abstractComponentCallbacksC03012 != null && abstractComponentCallbacksC03012.f1141 != null) {
                        c1489.m3124(m5309(abstractComponentCallbacksC03012));
                    }
                }
            }
        }
        String str = "Unknown cmd: ";
        int i16 = i5;
        while (i16 < i2) {
            C2177 c2178 = (C2177) arrayList.get(i16);
            if (((Boolean) arrayList2.get(i16)).booleanValue()) {
                c2178.m4229(-1);
                C2790 c2790 = c2178.f7187;
                ArrayList arrayList11 = c2178.f7191;
                boolean z10 = true;
                for (int size3 = arrayList11.size() - 1; size3 >= 0; size3--) {
                    C4088 c40811 = (C4088) arrayList11.get(size3);
                    AbstractComponentCallbacksC0308 abstractComponentCallbacksC03013 = c40811.f13652;
                    if (abstractComponentCallbacksC03013 != null) {
                        if (abstractComponentCallbacksC03013.f1115 != null) {
                            abstractComponentCallbacksC03013.m642().f15235 = z10;
                        }
                        int i17 = c2178.f7186;
                        char c = 8194;
                        char c2 = 4097;
                        if (i17 != 4097) {
                            if (i17 != 8194) {
                                c = 4100;
                                if (i17 != 8197) {
                                    c2 = 4099;
                                    if (i17 != 4099) {
                                        c = i17 != 4100 ? (char) 0 : (char) 8197;
                                    } else {
                                        c = c2;
                                    }
                                }
                            } else {
                                c = c2;
                            }
                        }
                        if (abstractComponentCallbacksC03013.f1115 != null || c != 0) {
                            abstractComponentCallbacksC03013.m642();
                            abstractComponentCallbacksC03013.f1115.getClass();
                        }
                        abstractComponentCallbacksC03013.m642();
                        abstractComponentCallbacksC03013.f1115.getClass();
                    }
                    switch (c40811.f13654) {
                        case 1:
                            abstractComponentCallbacksC03013.m639(c40811.f13655, c40811.f13650, c40811.f13651, c40811.f13657);
                            z10 = true;
                            c2790.m5288(abstractComponentCallbacksC03013, true);
                            c2790.m5296(abstractComponentCallbacksC03013);
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        default:
                            throw new IllegalArgumentException(str + c40811.f13654);
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            abstractComponentCallbacksC03013.m639(c40811.f13655, c40811.f13650, c40811.f13651, c40811.f13657);
                            c2790.m5289(abstractComponentCallbacksC03013);
                            z10 = true;
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            abstractComponentCallbacksC03013.m639(c40811.f13655, c40811.f13650, c40811.f13651, c40811.f13657);
                            m5264(abstractComponentCallbacksC03013);
                            z10 = true;
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            abstractComponentCallbacksC03013.m639(c40811.f13655, c40811.f13650, c40811.f13651, c40811.f13657);
                            c2790.m5288(abstractComponentCallbacksC03013, true);
                            c2790.m5292(abstractComponentCallbacksC03013);
                            z10 = true;
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            abstractComponentCallbacksC03013.m639(c40811.f13655, c40811.f13650, c40811.f13651, c40811.f13657);
                            c2790.m5267(abstractComponentCallbacksC03013);
                            z10 = true;
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            abstractComponentCallbacksC03013.m639(c40811.f13655, c40811.f13650, c40811.f13651, c40811.f13657);
                            c2790.m5288(abstractComponentCallbacksC03013, true);
                            c2790.m5286(abstractComponentCallbacksC03013);
                            z10 = true;
                            break;
                        case 8:
                            c2790.m5291(null);
                            z10 = true;
                            break;
                        case 9:
                            c2790.m5291(abstractComponentCallbacksC03013);
                            z10 = true;
                            break;
                        case 10:
                            c40811.f13656 = abstractComponentCallbacksC03013.f1138;
                            c2790.m5314(abstractComponentCallbacksC03013, c40811.f13653);
                            z10 = true;
                            break;
                    }
                }
            } else {
                c2178.m4229(1);
                C2790 c2791 = c2178.f7187;
                ArrayList arrayList12 = c2178.f7191;
                int size4 = arrayList12.size();
                int i18 = 0;
                while (i18 < size4) {
                    C4088 c40812 = (C4088) arrayList12.get(i18);
                    AbstractComponentCallbacksC0308 abstractComponentCallbacksC03014 = c40812.f13652;
                    if (abstractComponentCallbacksC03014 != null) {
                        if (abstractComponentCallbacksC03014.f1115 != null) {
                            abstractComponentCallbacksC03014.m642().f15235 = false;
                        }
                        int i19 = c2178.f7186;
                        if (abstractComponentCallbacksC03014.f1115 != null || i19 != 0) {
                            abstractComponentCallbacksC03014.m642();
                            abstractComponentCallbacksC03014.f1115.getClass();
                        }
                        abstractComponentCallbacksC03014.m642();
                        abstractComponentCallbacksC03014.f1115.getClass();
                    }
                    switch (c40812.f13654) {
                        case 1:
                            abstractComponentCallbacksC03014.m639(c40812.f13655, c40812.f13650, c40812.f13651, c40812.f13657);
                            c2791.m5288(abstractComponentCallbacksC03014, false);
                            c2791.m5289(abstractComponentCallbacksC03014);
                            i18++;
                            str = str;
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                        default:
                            throw new IllegalArgumentException(str + c40812.f13654);
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            abstractComponentCallbacksC03014.m639(c40812.f13655, c40812.f13650, c40812.f13651, c40812.f13657);
                            c2791.m5296(abstractComponentCallbacksC03014);
                            i18++;
                            str = str;
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            abstractComponentCallbacksC03014.m639(c40812.f13655, c40812.f13650, c40812.f13651, c40812.f13657);
                            c2791.m5292(abstractComponentCallbacksC03014);
                            i18++;
                            str = str;
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            abstractComponentCallbacksC03014.m639(c40812.f13655, c40812.f13650, c40812.f13651, c40812.f13657);
                            c2791.m5288(abstractComponentCallbacksC03014, false);
                            m5264(abstractComponentCallbacksC03014);
                            i18++;
                            str = str;
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            abstractComponentCallbacksC03014.m639(c40812.f13655, c40812.f13650, c40812.f13651, c40812.f13657);
                            c2791.m5286(abstractComponentCallbacksC03014);
                            i18++;
                            str = str;
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            abstractComponentCallbacksC03014.m639(c40812.f13655, c40812.f13650, c40812.f13651, c40812.f13657);
                            c2791.m5288(abstractComponentCallbacksC03014, false);
                            c2791.m5267(abstractComponentCallbacksC03014);
                            i18++;
                            str = str;
                            break;
                        case 8:
                            c2791.m5291(abstractComponentCallbacksC03014);
                            i18++;
                            str = str;
                            break;
                        case 9:
                            c2791.m5291(null);
                            i18++;
                            str = str;
                            break;
                        case 10:
                            c40812.f13653 = abstractComponentCallbacksC03014.f1138;
                            c2791.m5314(abstractComponentCallbacksC03014, c40812.f13656);
                            i18++;
                            str = str;
                            break;
                    }
                }
            }
            i16++;
            str = str;
        }
        boolean zBooleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
        if (z9 && !arrayList10.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(m5260((C2177) it2.next()));
            }
            if (this.f9312 == null) {
                Iterator it3 = arrayList10.iterator();
                while (it3.hasNext()) {
                    if (it3.next() != null) {
                        C0178.m382();
                        return;
                    }
                    Iterator it4 = linkedHashSet.iterator();
                    if (it4.hasNext()) {
                        throw null;
                    }
                }
                Iterator it5 = arrayList10.iterator();
                while (it5.hasNext()) {
                    if (it5.next() != null) {
                        C0178.m382();
                        return;
                    }
                    Iterator it6 = linkedHashSet.iterator();
                    if (it6.hasNext()) {
                        throw null;
                    }
                }
            }
        }
        for (int i20 = i5; i20 < i2; i20++) {
            C2177 c2179 = (C2177) arrayList.get(i20);
            if (zBooleanValue2) {
                for (int size5 = c2179.f7191.size() - 1; size5 >= 0; size5--) {
                    AbstractComponentCallbacksC0308 abstractComponentCallbacksC03015 = ((C4088) c2179.f7191.get(size5)).f13652;
                    if (abstractComponentCallbacksC03015 != null) {
                        m5309(abstractComponentCallbacksC03015).m2623();
                    }
                }
            } else {
                Iterator it7 = c2179.f7191.iterator();
                while (it7.hasNext()) {
                    AbstractComponentCallbacksC0308 abstractComponentCallbacksC03016 = ((C4088) it7.next()).f13652;
                    if (abstractComponentCallbacksC03016 != null) {
                        m5309(abstractComponentCallbacksC03016).m2623();
                    }
                }
            }
        }
        m5313(this.f9332, true);
        for (C4526 c4526 : m5274(arrayList, i5, i2)) {
            c4526.f14959 = zBooleanValue2;
            synchronized (c4526.f14961) {
                c4526.m7849();
                ArrayList arrayList13 = c4526.f14961;
                ListIterator listIterator = arrayList13.listIterator(arrayList13.size());
                if (listIterator.hasPrevious()) {
                    throw null;
                }
                c4526.f14960 = false;
            }
            c4526.m7850();
        }
        while (i5 < i2) {
            C2177 c21710 = (C2177) arrayList.get(i5);
            if (((Boolean) arrayList2.get(i5)).booleanValue() && c21710.f7184 >= 0) {
                c21710.f7184 = -1;
            }
            if (c21710.f7200 != null) {
                for (int i21 = 0; i21 < c21710.f7200.size(); i21++) {
                    ((Runnable) c21710.f7200.get(i21)).run();
                }
                c21710.f7200 = null;
            }
            i5++;
        }
        if (!z9 || arrayList10.size() <= 0) {
            return;
        }
        arrayList10.get(0).getClass();
        C0178.m382();
    }

    /* JADX INFO: renamed from: ۥۨ */
    public final void m5294(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        ViewGroup viewGroupM5285 = m5285(abstractComponentCallbacksC0308);
        if (viewGroupM5285 != null) {
            C4613 c4613 = abstractComponentCallbacksC0308.f1115;
            if ((c4613 == null ? 0 : c4613.f15231) + (c4613 == null ? 0 : c4613.f15236) + (c4613 == null ? 0 : c4613.f15230) + (c4613 == null ? 0 : c4613.f15233) > 0) {
                if (viewGroupM5285.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupM5285.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0308);
                }
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = (AbstractComponentCallbacksC0308) viewGroupM5285.getTag(R.id.visible_removing_fragment_view_tag);
                C4613 c4614 = abstractComponentCallbacksC0308.f1115;
                boolean z = c4614 != null ? c4614.f15235 : false;
                if (abstractComponentCallbacksC0309.f1115 == null) {
                    return;
                }
                abstractComponentCallbacksC0309.m642().f15235 = z;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m5295() {
        this.f9310 = false;
        this.f9296.clear();
        this.f9325.clear();
    }

    /* JADX INFO: renamed from: ۦؒ */
    public final void m5296(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        if (m5261(2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0308 + " nesting=" + abstractComponentCallbacksC0308.f1143);
        }
        boolean zM653 = abstractComponentCallbacksC0308.m653();
        if (abstractComponentCallbacksC0308.f1124 && zM653) {
            return;
        }
        C1489 c1489 = this.f9298;
        synchronized (((ArrayList) c1489.f5059)) {
            ((ArrayList) c1489.f5059).remove(abstractComponentCallbacksC0308);
        }
        abstractComponentCallbacksC0308.f1125 = false;
        if (m5262(abstractComponentCallbacksC0308)) {
            this.f9319 = true;
        }
        abstractComponentCallbacksC0308.f1114 = true;
        m5294(abstractComponentCallbacksC0308);
    }

    /* JADX INFO: renamed from: ۦؔ */
    public final void m5297() {
        synchronized (this.f9313) {
            try {
                if (!this.f9313.isEmpty()) {
                    this.f9323.m3482(true);
                    if (m5261(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z = this.f9316.size() + (this.f9312 != null ? 1 : 0) > 0 && m5263(this.f9308);
                if (m5261(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.f9323.m3482(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final C3223 m5298() {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f9308;
        return abstractComponentCallbacksC0308 != null ? abstractComponentCallbacksC0308.f1141.m5298() : this.f9315;
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final C3698 m5299() {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f9308;
        return abstractComponentCallbacksC0308 != null ? abstractComponentCallbacksC0308.f1141.m5299() : this.f9295;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final void m5300() {
        boolean zIsTerminated;
        this.f9318 = true;
        m5265(true);
        m5303();
        C0827 c0827 = this.f9309;
        C1489 c1489 = this.f9298;
        if (c0827 != null ? ((C0333) c1489.f5056).f1246 : !c0827.f2924.isChangingConfigurations()) {
            Iterator it = this.f9320.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((C2964) it.next()).f9942.iterator();
                while (it2.hasNext()) {
                    ((C0333) c1489.f5056).m766((String) it2.next(), false);
                }
            }
        }
        m5305(-1);
        C0827 c0828 = this.f9309;
        if (c0828 != null) {
            c0828.f2926.f5099.remove(this.f9304);
        }
        C0827 c0829 = this.f9309;
        if (c0829 != null) {
            c0829.f2926.f5095.remove(this.f9303);
        }
        C0827 c08210 = this.f9309;
        if (c08210 != null) {
            c08210.f2926.f5087.remove(this.f9300);
        }
        C0827 c08211 = this.f9309;
        if (c08211 != null) {
            c08211.f2926.f5086.remove(this.f9306);
        }
        C0827 c08212 = this.f9309;
        if (c08212 != null && this.f9308 == null) {
            C2808 c2808 = c08212.f2926.f5090;
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) c2808.f9376;
            C2050 c2050 = this.f9326;
            copyOnWriteArrayList.remove(c2050);
            if (((HashMap) c2808.f9377).remove(c2050) == null) {
                ((Runnable) c2808.f9378).run();
            } else {
                C0178.m382();
            }
        }
        this.f9309 = null;
        this.f9324 = null;
        this.f9308 = null;
        if (this.f9330 != null) {
            C0316 c0316 = this.f9323;
            ArrayList arrayList = c0316.f5550;
            CopyOnWriteArrayList<AutoCloseable> copyOnWriteArrayList2 = c0316.f5548;
            for (AutoCloseable autoCloseable : copyOnWriteArrayList2) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        C0178.m393();
                        return;
                    }
                    ((MediaDrm) autoCloseable).release();
                }
            }
            copyOnWriteArrayList2.clear();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((C1585) it3.next()).m3325();
            }
            arrayList.clear();
            this.f9330 = null;
        }
        C5002 c5002 = this.f9299;
        if (c5002 != null) {
            c5002.m8392();
            this.f9327.m8392();
            this.f9305.m8392();
        }
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final void m5301(boolean z) {
        if (z && this.f9309 != null) {
            m5284(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 : this.f9298.m3106()) {
            if (abstractComponentCallbacksC0308 != null) {
                abstractComponentCallbacksC0308.f1139 = true;
                if (z) {
                    abstractComponentCallbacksC0308.f1142.m5301(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦِ */
    public final boolean m5302() {
        if (this.f9332 >= 1) {
            for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 : this.f9298.m3106()) {
                if (abstractComponentCallbacksC0308 != null) {
                    if (!abstractComponentCallbacksC0308.f1153 ? abstractComponentCallbacksC0308.f1142.m5302() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m5303() {
        Iterator it = m5272().iterator();
        while (it.hasNext()) {
            ((C4526) it.next()).m7848();
        }
    }

    /* JADX INFO: renamed from: ۦٖ */
    public final boolean m5304() {
        AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f9308;
        if (abstractComponentCallbacksC0308 == null) {
            return true;
        }
        return abstractComponentCallbacksC0308.f1136 != null && abstractComponentCallbacksC0308.f1125 && abstractComponentCallbacksC0308.m657().m5304();
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m5305(int i) {
        try {
            this.f9310 = true;
            for (C1239 c1239 : ((HashMap) this.f9298.f5057).values()) {
                if (c1239 != null) {
                    c1239.f4259 = i;
                }
            }
            m5313(i, false);
            Iterator it = m5272().iterator();
            while (it.hasNext()) {
                ((C4526) it.next()).m7848();
            }
            this.f9310 = false;
            m5265(true);
        } catch (Throwable th) {
            this.f9310 = false;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final void m5306() {
        for (C4526 c4526 : m5272()) {
            if (c4526.f14960) {
                if (m5261(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c4526.f14960 = false;
                c4526.m7850();
            }
        }
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final void m5307(boolean z) {
        if (z && this.f9309 != null) {
            m5284(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 : this.f9298.m3106()) {
            if (abstractComponentCallbacksC0308 != null) {
                abstractComponentCallbacksC0308.f1139 = true;
                if (z) {
                    abstractComponentCallbacksC0308.f1142.m5307(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final boolean m5308() {
        if (this.f9332 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 : this.f9298.m3106()) {
            if (abstractComponentCallbacksC0308 != null && m5259(abstractComponentCallbacksC0308)) {
                if (!abstractComponentCallbacksC0308.f1153 ? abstractComponentCallbacksC0308.f1142.m5308() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0308);
                    z = true;
                }
            }
        }
        if (this.f9301 != null) {
            for (int i = 0; i < this.f9301.size(); i++) {
                AbstractComponentCallbacksC0308 abstractComponentCallbacksC0309 = (AbstractComponentCallbacksC0308) this.f9301.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0309)) {
                    abstractComponentCallbacksC0309.getClass();
                }
            }
        }
        this.f9301 = arrayList;
        return z;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final C1239 m5309(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308) {
        String str = abstractComponentCallbacksC0308.f1118;
        C1489 c1489 = this.f9298;
        C1239 c1239 = (C1239) ((HashMap) c1489.f5057).get(str);
        if (c1239 != null) {
            return c1239;
        }
        C1239 c12310 = new C1239(this.f9336, c1489, abstractComponentCallbacksC0308);
        c12310.m2621(this.f9309.f2924.getClassLoader());
        c12310.f4259 = this.f9332;
        return c12310;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final void m5310(boolean z) {
        if (z && this.f9309 != null) {
            m5284(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 : this.f9298.m3106()) {
            if (abstractComponentCallbacksC0308 != null && z) {
                abstractComponentCallbacksC0308.f1142.m5310(true);
            }
        }
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final void m5311() {
        if (this.f9322) {
            this.f9322 = false;
            m5273();
        }
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final boolean m5312() {
        if (this.f9332 >= 1) {
            for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 : this.f9298.m3106()) {
                if (abstractComponentCallbacksC0308 != null) {
                    if (!abstractComponentCallbacksC0308.f1153 ? abstractComponentCallbacksC0308.f1142.m5312() : false) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦۣ */
    public final void m5313(int i, boolean z) {
        C0827 c0827;
        if (this.f9309 == null && i != -1) {
            C1078.m2276("No activity");
            return;
        }
        if (z || i != this.f9332) {
            this.f9332 = i;
            C1489 c1489 = this.f9298;
            HashMap map = (HashMap) c1489.f5057;
            Iterator it = ((ArrayList) c1489.f5059).iterator();
            while (it.hasNext()) {
                C1239 c1239 = (C1239) map.get(((AbstractComponentCallbacksC0308) it.next()).f1118);
                if (c1239 != null) {
                    c1239.m2623();
                }
            }
            for (C1239 c12310 : map.values()) {
                if (c12310 != null) {
                    c12310.m2623();
                    AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = c12310.f4258;
                    if (abstractComponentCallbacksC0308.f1114 && !abstractComponentCallbacksC0308.m653()) {
                        c1489.m3141(c12310);
                    }
                }
            }
            m5273();
            if (this.f9319 && (c0827 = this.f9309) != null && this.f9332 == 7) {
                c0827.f2926.invalidateOptionsMenu();
                this.f9319 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۧ */
    public final void m5314(AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308, EnumC0458 enumC0458) {
        if (abstractComponentCallbacksC0308 == this.f9298.m3170(abstractComponentCallbacksC0308.f1118) && (abstractComponentCallbacksC0308.f1136 == null || abstractComponentCallbacksC0308.f1141 == this)) {
            abstractComponentCallbacksC0308.f1138 = enumC0458;
        } else {
            C2316.m4359("Fragment ", abstractComponentCallbacksC0308, " is not an active fragment of FragmentManager ", this);
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m5315() {
        for (AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 : this.f9298.m3129()) {
            if (abstractComponentCallbacksC0308 != null) {
                abstractComponentCallbacksC0308.m652();
                abstractComponentCallbacksC0308.f1142.m5315();
            }
        }
    }
}
