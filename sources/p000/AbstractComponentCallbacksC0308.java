package p000;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ۥؓؓۚٓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC0308 implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC4507, InterfaceC4680, InterfaceC5833, InterfaceC3983 {

    /* JADX INFO: renamed from: ۦ */
    public static final Object f1111 = new Object();

    /* JADX INFO: renamed from: ۥؓ */
    public boolean f1112;

    /* JADX INFO: renamed from: ۥؔ */
    public int f1113;

    /* JADX INFO: renamed from: ۥؖ */
    public boolean f1114;

    /* JADX INFO: renamed from: ۥؙ */
    public C4613 f1115;

    /* JADX INFO: renamed from: ۥً */
    public boolean f1117;

    /* JADX INFO: renamed from: ۥِ */
    public final C3543 f1119;

    /* JADX INFO: renamed from: ۥْ */
    public SparseArray f1120;

    /* JADX INFO: renamed from: ۥٓ */
    public Bundle f1121;

    /* JADX INFO: renamed from: ۥٕ */
    public boolean f1122;

    /* JADX INFO: renamed from: ۥٖ */
    public Bundle f1123;

    /* JADX INFO: renamed from: ۥ٘ */
    public boolean f1124;

    /* JADX INFO: renamed from: ۥٙ */
    public boolean f1125;

    /* JADX INFO: renamed from: ۥٛ */
    public boolean f1126;

    /* JADX INFO: renamed from: ۥٝ */
    public ViewGroup f1127;

    /* JADX INFO: renamed from: ۥۖ */
    public int f1128;

    /* JADX INFO: renamed from: ۥۘ */
    public C2346 f1129;

    /* JADX INFO: renamed from: ۥۙ */
    public boolean f1130;

    /* JADX INFO: renamed from: ۥ۟ */
    public boolean f1131;

    /* JADX INFO: renamed from: ۥۡ */
    public boolean f1132;

    /* JADX INFO: renamed from: ۥۢ */
    public final C5173 f1133;

    /* JADX INFO: renamed from: ۥۥ */
    public String f1135;

    /* JADX INFO: renamed from: ۥۦ */
    public C0827 f1136;

    /* JADX INFO: renamed from: ۥۧ */
    public boolean f1137;

    /* JADX INFO: renamed from: ۥۨ */
    public EnumC0458 f1138;

    /* JADX INFO: renamed from: ۦؒ */
    public boolean f1139;

    /* JADX INFO: renamed from: ۦؔ */
    public final ArrayList f1140;

    /* JADX INFO: renamed from: ۦؖ */
    public C2790 f1141;

    /* JADX INFO: renamed from: ۦؙ */
    public int f1143;

    /* JADX INFO: renamed from: ۦُ */
    public AbstractComponentCallbacksC0308 f1144;

    /* JADX INFO: renamed from: ۦٖ */
    public int f1146;

    /* JADX INFO: renamed from: ۦٗ */
    public AbstractComponentCallbacksC0308 f1147;

    /* JADX INFO: renamed from: ۦٚ */
    public boolean f1148;

    /* JADX INFO: renamed from: ۦۜ */
    public String f1150;

    /* JADX INFO: renamed from: ۦ۟ */
    public Bundle f1151;

    /* JADX INFO: renamed from: ۦ۠ */
    public C4170 f1152;

    /* JADX INFO: renamed from: ۦۣ */
    public boolean f1153;

    /* JADX INFO: renamed from: ۦۧ */
    public boolean f1154;

    /* JADX INFO: renamed from: ۦۨ */
    public int f1155 = -1;

    /* JADX INFO: renamed from: ۥَ */
    public String f1118 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: ۦۛ */
    public String f1149 = null;

    /* JADX INFO: renamed from: ۦٕ */
    public Boolean f1145 = null;

    /* JADX INFO: renamed from: ۦؗ */
    public C2790 f1142 = new C2790();

    /* JADX INFO: renamed from: ۥۤ */
    public final boolean f1134 = true;

    /* JADX INFO: renamed from: ۥؚ */
    public boolean f1116 = true;

    public AbstractComponentCallbacksC0308() {
        new RunnableC3365(6, this);
        this.f1138 = EnumC0458.f1652;
        this.f1119 = new C3543();
        new AtomicInteger();
        this.f1140 = new ArrayList();
        this.f1133 = new C5173(this);
        m654();
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.f1139 = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        C0827 c0827 = this.f1136;
        AbstractActivityC2747 abstractActivityC2747 = c0827 == null ? null : c0827.f2927;
        if (abstractActivityC2747 != null) {
            abstractActivityC2747.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        } else {
            C5028.m8446(this, " not attached to an activity.", "Fragment ");
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f1139 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1118);
        if (this.f1146 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1146));
        }
        if (this.f1150 != null) {
            sb.append(" tag=");
            sb.append(this.f1150);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final void m639(int i, int i2, int i3, int i4) {
        if (this.f1115 == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        m642().f15233 = i;
        m642().f15230 = i2;
        m642().f15236 = i3;
        m642().f15231 = i4;
    }

    @Override // p000.InterfaceC5833
    /* JADX INFO: renamed from: ۥؗ */
    public final C4397 mo640() {
        Application application;
        Context applicationContext = m646().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && C2790.m5261(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + m646().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        C4397 c4397 = new C4397(0);
        if (application != null) {
            c4397.m7687(C4800.f15837, application);
        }
        c4397.m7687(AbstractC2765.f9171, this);
        c4397.m7687(AbstractC2765.f9173, this);
        Bundle bundle = this.f1123;
        if (bundle != null) {
            c4397.m7687(AbstractC2765.f9175, bundle);
        }
        return c4397;
    }

    /* JADX INFO: renamed from: ۥَ */
    public abstract void mo641();

    /* JADX INFO: renamed from: ۥُ */
    public final C4613 m642() {
        C4613 c4613 = this.f1115;
        if (c4613 != null) {
            return c4613;
        }
        C4613 c4614 = new C4613();
        Object obj = f1111;
        c4614.f15232 = obj;
        c4614.f15238 = obj;
        c4614.f15234 = obj;
        c4614.f15237 = null;
        this.f1115 = c4614;
        return c4614;
    }

    @Override // p000.InterfaceC4507
    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC1434 mo110() {
        return this.f1152;
    }

    /* JADX INFO: renamed from: ۥْ */
    public abstract void mo643(Bundle bundle);

    /* JADX INFO: renamed from: ۥٓ */
    public abstract void mo644();

    /* JADX INFO: renamed from: ۥٖ */
    public LayoutInflater mo645(Bundle bundle) {
        C0827 c0827 = this.f1136;
        if (c0827 == null) {
            C1078.m2276("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        AbstractActivityC2747 abstractActivityC2747 = c0827.f2926;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC2747.getLayoutInflater().cloneInContext(abstractActivityC2747);
        layoutInflaterCloneInContext.setFactory2(this.f1142.f9302);
        return layoutInflaterCloneInContext;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final Context m646() {
        C0827 c0827 = this.f1136;
        AbstractActivityC2747 abstractActivityC2747 = c0827 == null ? null : c0827.f2924;
        if (abstractActivityC2747 != null) {
            return abstractActivityC2747;
        }
        C5028.m8446(this, " not attached to a context.", "Fragment ");
        return null;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public abstract void mo647();

    @Override // p000.InterfaceC3983
    /* JADX INFO: renamed from: ۥۗ */
    public final C2346 mo648() {
        return (C2346) this.f1129.f7785;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final int m649() {
        EnumC0458 enumC0458 = this.f1138;
        return (enumC0458 == EnumC0458.f1656 || this.f1144 == null) ? enumC0458.ordinal() : Math.min(enumC0458.ordinal(), this.f1144.m649());
    }

    /* JADX INFO: renamed from: ۥۣ */
    public abstract AbstractC0993 mo650();

    @Override // p000.InterfaceC4680
    /* JADX INFO: renamed from: ۦؑ */
    public final C3160 mo651() {
        if (this.f1141 == null) {
            C1078.m2276("Can't access ViewModels from detached fragment");
            return null;
        }
        if (m649() == 1) {
            C1078.m2276("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.f1141.f9335.f1248;
        C3160 c3160 = (C3160) map.get(this.f1118);
        if (c3160 != null) {
            return c3160;
        }
        C3160 c3161 = new C3160();
        map.put(this.f1118, c3161);
        return c3161;
    }

    /* JADX INFO: renamed from: ۦؚ */
    public final boolean m652() {
        if (this.f1153) {
            return true;
        }
        C2790 c2790 = this.f1141;
        if (c2790 != null) {
            AbstractComponentCallbacksC0308 abstractComponentCallbacksC0308 = this.f1144;
            c2790.getClass();
            if (abstractComponentCallbacksC0308 == null ? false : abstractComponentCallbacksC0308.m652()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final boolean m653() {
        return this.f1143 > 0;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m654() {
        this.f1152 = new C4170(this, true);
        this.f1129 = new C2346(new C5140(this, new C0463(0, this)), 6);
        ArrayList arrayList = this.f1140;
        C5173 c5173 = this.f1133;
        if (arrayList.contains(c5173)) {
            return;
        }
        if (this.f1155 >= 0) {
            c5173.m8779();
        } else {
            arrayList.add(c5173);
        }
    }

    /* JADX INFO: renamed from: ۦٕ */
    public void mo655(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1142.m5278();
        this.f1130 = true;
        mo651();
    }

    /* JADX INFO: renamed from: ۦٗ */
    public abstract void mo656(Bundle bundle);

    /* JADX INFO: renamed from: ۦٛ */
    public final C2790 m657() {
        C2790 c2790 = this.f1141;
        if (c2790 != null) {
            return c2790;
        }
        C5028.m8446(this, " not associated with a fragment manager.", "Fragment ");
        return null;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m658() {
        m654();
        this.f1135 = this.f1118;
        this.f1118 = UUID.randomUUID().toString();
        this.f1125 = false;
        this.f1114 = false;
        this.f1137 = false;
        this.f1117 = false;
        this.f1122 = false;
        this.f1143 = 0;
        this.f1141 = null;
        this.f1142 = new C2790();
        this.f1136 = null;
        this.f1146 = 0;
        this.f1113 = 0;
        this.f1150 = null;
        this.f1153 = false;
        this.f1124 = false;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final C2790 m659() {
        if (this.f1136 != null) {
            return this.f1142;
        }
        C5028.m8446(this, " has not been attached yet.", "Fragment ");
        return null;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public abstract void mo660();

    /* JADX INFO: renamed from: ۦۛ */
    public abstract void mo661();

    /* JADX INFO: renamed from: ۦ۟ */
    public void mo662(AbstractActivityC2747 abstractActivityC2747) {
        this.f1139 = true;
        C0827 c0827 = this.f1136;
        if ((c0827 == null ? null : c0827.f2927) != null) {
            this.f1139 = true;
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public void m663(int i, int i2, Intent intent) {
        if (C2790.m5261(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }
}
