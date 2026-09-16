package androidx.work.impl;

import android.os.Looper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p000.AbstractC0772;
import p000.AbstractC0973;
import p000.AbstractC4105;
import p000.AbstractC4554;
import p000.AbstractC5041;
import p000.AbstractC5537;
import p000.AbstractC5573;
import p000.C0177;
import p000.C0956;
import p000.C1076;
import p000.C1078;
import p000.C1345;
import p000.C1590;
import p000.C1894;
import p000.C2340;
import p000.C2718;
import p000.C3131;
import p000.C3352;
import p000.C3488;
import p000.C3551;
import p000.C3680;
import p000.C3950;
import p000.C4775;
import p000.C4794;
import p000.C5002;
import p000.C5301;
import p000.C5558;
import p000.ExecutorC2205;
import p000.InterfaceC0443;
import p000.InterfaceC2488;
import p000.InterfaceC5731;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase {

    /* JADX INFO: renamed from: ۥؗ */
    public ExecutorC2205 f249;

    /* JADX INFO: renamed from: ۥُ */
    public C4775 f250;

    /* JADX INFO: renamed from: ۥۗ */
    public Executor f252;

    /* JADX INFO: renamed from: ۥۣ */
    public C3950 f254;

    /* JADX INFO: renamed from: ۦؑ */
    public C3352 f255;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f258;

    /* JADX INFO: renamed from: ۥّ */
    public final C5002 f251 = new C5002(13);

    /* JADX INFO: renamed from: ۥۜ */
    public final ThreadLocal f253 = new ThreadLocal();

    /* JADX INFO: renamed from: ۦٛ */
    public final LinkedHashMap f257 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۦِ */
    public boolean f256 = true;

    /* JADX INFO: renamed from: ۥؗ */
    public List mo83(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC4554.m7911(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(((C3131) entry.getKey()).f10543, entry.getValue());
        }
        return C2340.f7777;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final Object m84(boolean z, InterfaceC5731 interfaceC5731, AbstractC0772 abstractC0772) {
        C3352 c3352 = this.f255;
        if (c3352 == null) {
            c3352 = null;
        }
        return c3352.f11209.mo6150(z, interfaceC5731, abstractC0772);
    }

    /* JADX INFO: renamed from: ۥُ */
    public AbstractC4105 mo85() {
        throw new C1345();
    }

    /* JADX INFO: renamed from: ۥّ */
    public abstract C1894 mo86();

    /* JADX INFO: renamed from: ۥْ */
    public final void m87() {
        m101().mo3508().m1983();
    }

    /* JADX INFO: renamed from: ۥٓ */
    public abstract C3551 mo88();

    /* JADX INFO: renamed from: ۥٖ */
    public abstract C1076 mo89();

    /* JADX INFO: renamed from: ۥۖ */
    public abstract C5301 mo90();

    /* JADX INFO: renamed from: ۥۗ */
    public final void m91() {
        m93();
        m93();
        C0956 c0956Mo3508 = m101().mo3508();
        if (!c0956Mo3508.m1987()) {
            C4775 c4775 = this.f250;
            InterfaceC0443 interfaceC0443 = null;
            if (c4775 == null) {
                c4775 = null;
            }
            c4775.getClass();
            C2718 c2718 = new C2718(c4775, interfaceC0443, 3);
            Thread.interrupted();
            AbstractC5537.m9243(C4794.f15814, new C5558(c2718, interfaceC0443, 4));
        }
        if (c0956Mo3508.f3394.isWriteAheadLoggingEnabled()) {
            c0956Mo3508.m1985();
        } else {
            c0956Mo3508.m1986();
        }
    }

    /* JADX INFO: renamed from: ۥۜ */
    public Set mo92() {
        C1590 c1590 = C1590.f5346;
        ArrayList arrayList = new ArrayList(AbstractC5573.m9402(c1590, 10));
        Iterator<E> it = c1590.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC5041.m8557((Class) it.next()));
        }
        return AbstractC0973.m2052(arrayList);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m93() {
        if (this.f258) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            C1078.m2276("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public abstract C4775 mo94();

    /* JADX INFO: renamed from: ۦؚ */
    public final void m95() {
        m101().mo3508().m1981();
        if (m100()) {
            return;
        }
        C4775 c4775 = this.f250;
        if (c4775 == null) {
            c4775 = null;
        }
        c4775.f15739.m6607(c4775.f15741, c4775.f15748);
    }

    /* JADX INFO: renamed from: ۦٌ */
    public final boolean m96() {
        C3352 c3352 = this.f255;
        if (c3352 == null) {
            c3352 = null;
        }
        C0956 c0956 = c3352.f11213;
        if (c0956 != null) {
            return c0956.f3394.isOpen();
        }
        return false;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final boolean m97() {
        C3352 c3352 = this.f255;
        if (c3352 == null) {
            c3352 = null;
        }
        return c3352.m6116() != null;
    }

    /* JADX INFO: renamed from: ۦٗ */
    public abstract C3488 mo98();

    /* JADX INFO: renamed from: ۦٛ */
    public LinkedHashMap mo99() {
        int iM7911 = AbstractC4554.m7911(AbstractC5573.m9402(C1590.f5346, 10));
        if (iM7911 < 16) {
            iM7911 = 16;
        }
        return new LinkedHashMap(iM7911);
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final boolean m100() {
        return m96() && m101().mo3508().m1987();
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final InterfaceC2488 m101() {
        C3352 c3352 = this.f255;
        if (c3352 == null) {
            c3352 = null;
        }
        InterfaceC2488 interfaceC2488M6116 = c3352.m6116();
        if (interfaceC2488M6116 != null) {
            return interfaceC2488M6116;
        }
        C1078.m2276("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public abstract C3680 mo102();

    /* JADX INFO: renamed from: ۦۛ */
    public abstract C0177 mo103();

    /* JADX INFO: renamed from: ۦ۟ */
    public final void m104(Runnable runnable) {
        m91();
        try {
            runnable.run();
            m87();
        } finally {
            m95();
        }
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final Object m105(Callable callable) {
        m91();
        try {
            Object objCall = callable.call();
            m87();
            return objCall;
        } finally {
            m95();
        }
    }
}
