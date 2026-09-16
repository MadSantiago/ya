package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ۦْؖ۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4085 implements Handler.Callback {

    /* JADX INFO: renamed from: ۥٓ */
    public static C4085 f13623;

    /* JADX INFO: renamed from: ۥؗ */
    public C0307 f13626;

    /* JADX INFO: renamed from: ۥُ */
    public final Context f13627;

    /* JADX INFO: renamed from: ۥّ */
    public final C1991 f13628;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f13629;

    /* JADX INFO: renamed from: ۥۜ */
    public final AtomicInteger f13630;

    /* JADX INFO: renamed from: ۥۣ */
    public long f13631;

    /* JADX INFO: renamed from: ۦؑ */
    public C3535 f13632;

    /* JADX INFO: renamed from: ۦؚ */
    public final C1821 f13633;

    /* JADX INFO: renamed from: ۦٌ */
    public final HandlerC0645 f13634;

    /* JADX INFO: renamed from: ۦِ */
    public final ConcurrentHashMap f13635;

    /* JADX INFO: renamed from: ۦٛ */
    public final AtomicInteger f13636;

    /* JADX INFO: renamed from: ۦۗ */
    public final C1821 f13637;

    /* JADX INFO: renamed from: ۦۙ */
    public final C2391 f13638;

    /* JADX INFO: renamed from: ۦۚ */
    public volatile boolean f13639;

    /* JADX INFO: renamed from: ۦۨ */
    public static final Status f13625 = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* JADX INFO: renamed from: ۦ۟ */
    public static final Status f13624 = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* JADX INFO: renamed from: ۥْ */
    public static final Object f13622 = new Object();

    public C4085(Context context, Looper looper) {
        C1991 c1991 = C1991.f6570;
        this.f13631 = 10000L;
        this.f13629 = false;
        this.f13630 = new AtomicInteger(1);
        this.f13636 = new AtomicInteger(0);
        this.f13635 = new ConcurrentHashMap(5, 0.75f, 1);
        this.f13637 = new C1821(0);
        this.f13633 = new C1821(0);
        this.f13639 = true;
        this.f13627 = context;
        HandlerC0645 handlerC0645 = new HandlerC0645(looper, this);
        Looper.getMainLooper();
        this.f13634 = handlerC0645;
        this.f13628 = c1991;
        this.f13638 = new C2391(5);
        PackageManager packageManager = context.getPackageManager();
        Boolean boolValueOf = AbstractC3933.f13130;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
            AbstractC3933.f13130 = boolValueOf;
        }
        if (boolValueOf.booleanValue()) {
            this.f13639 = false;
        }
        handlerC0645.sendMessage(handlerC0645.obtainMessage(6));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static Status m7271(C5001 c5001, C2612 c2612) {
        return new Status(17, "API: " + ((String) c5001.f16545.f16550) + " is not available on this device. Connection failed with: " + String.valueOf(c2612), c2612.f8711, c2612);
    }

    /* JADX INFO: renamed from: ۥُ */
    public static C4085 m7272(Context context) {
        C4085 c4085;
        HandlerThread handlerThread;
        synchronized (f13622) {
            c4085 = f13623;
            if (c4085 == null) {
                synchronized (C3827.f12686) {
                    try {
                        handlerThread = C3827.f12685;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            C3827.f12685 = handlerThread2;
                            handlerThread2.start();
                            handlerThread = C3827.f12685;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Looper looper = handlerThread.getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = C1991.f6569;
                C4085 c4086 = new C4085(applicationContext, looper);
                f13623 = c4086;
                c4085 = c4086;
            }
        }
        return c4085;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x0349  */
    /* JADX WARN: Code duplicated, block: B:178:0x034f  */
    /* JADX WARN: Code duplicated, block: B:180:0x037b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0385  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v5 ￛﾦ￘ﾓ￘ﾖ￘ﾓ￙ﾜ, still in use, count: 2, list:
          (r3v5 ￛﾦ￘ﾓ￘ﾖ￘ﾓ￙ﾜ) from 0x0341: IGET (r3v5 ￛﾦ￘ﾓ￘ﾖ￘ﾓ￙ﾜ) A[WRAPPED] (LINE:834) ￛﾦ￘ﾓ￘ﾖ￘ﾓ￙ﾜ.ￛﾦ￙ﾗ int
          (r3v5 ￛﾦ￘ﾓ￘ﾖ￘ﾓ￙ﾜ) from 0x0347: PHI (r3 I:??) = (r3v2 ￛﾦ￘ﾓ￘ﾖ￘ﾓ￙ﾜ), (r3v5 ￛﾦ￘ﾓ￘ﾖ￘ﾓ￙ﾜ) binds: [B:174:0x0346, B:231:0x0347] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r13) {
        /*
            Method dump skipped, instruction units count: 1106
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4085.handleMessage(android.os.Message):boolean");
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m7273(C2612 c2612, int i) {
        if (m7274(c2612, i)) {
            return;
        }
        HandlerC0645 handlerC0645 = this.f13634;
        handlerC0645.sendMessage(handlerC0645.obtainMessage(5, i, 0, c2612));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final boolean m7274(C2612 c2612, int i) {
        C1991 c1991 = this.f13628;
        c1991.getClass();
        Context context = this.f13627;
        if (!AbstractC3933.m7083(context)) {
            int i2 = c2612.f8713;
            PendingIntent activity = c2612.f8711;
            if (!((i2 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentM1309 = c1991.m1309(i2, context, null);
                if (intentM1309 != null) {
                    activity = PendingIntent.getActivity(context, 0, intentM1309, 201326592);
                }
            }
            if (activity != null) {
                int i3 = GoogleApiActivity.f294;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                c1991.m3897(context, i2, PendingIntent.getActivity(context, 0, intent, AbstractC4667.f15371 | 134217728));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final boolean m7275() {
        if (this.f13629) {
            return false;
        }
        C0373.m797();
        int i = ((SparseIntArray) this.f13638.f7924).get(203400000, -1);
        return i == -1 || i == 0;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final C3184 m7276(AbstractC4501 abstractC4501) {
        C5001 c5001 = abstractC4501.f14877;
        ConcurrentHashMap concurrentHashMap = this.f13635;
        C3184 c3184 = (C3184) concurrentHashMap.get(c5001);
        if (c3184 == null) {
            c3184 = new C3184(this, abstractC4501);
            concurrentHashMap.put(c5001, c3184);
        }
        if (c3184.f10702.mo1833()) {
            this.f13633.add(c5001);
        }
        c3184.m5873();
        return c3184;
    }
}
