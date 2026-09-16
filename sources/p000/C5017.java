package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Trace;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ۦۘؓۨؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5017 implements InterfaceC5346, InterfaceC1636, InterfaceC2740, InterfaceC0557, InterfaceC1268, InterfaceC5109 {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f16599;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f16600;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f16601;

    public /* synthetic */ C5017(int i, Object obj, Object obj2) {
        this.f16601 = i;
        this.f16600 = obj;
        this.f16599 = obj2;
    }

    @Override // p000.InterfaceC1268
    public Object apply(Object obj) {
        C1835 c1835 = (C1835) this.f16600;
        C1360 c1360 = (C1360) this.f16599;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C1276 c1276 = c1835.f6101;
        ArrayList arrayListM3607 = c1835.m3607(sQLiteDatabase, c1360, c1276.f4352);
        for (EnumC4021 enumC4021 : EnumC4021.values()) {
            if (enumC4021 != c1360.f4674) {
                int size = c1276.f4352 - arrayListM3607.size();
                if (size <= 0) {
                    break;
                }
                arrayListM3607.addAll(c1835.m3607(sQLiteDatabase, c1360.m2866(enumC4021), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i = 0; i < arrayListM3607.size(); i++) {
            sb.append(((C5793) arrayListM3607.get(i)).f19087);
            if (i < arrayListM3607.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new C0148(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListM3607.listIterator();
        while (listIterator.hasNext()) {
            C5793 c5793 = (C5793) listIterator.next();
            long j2 = c5793.f19087;
            if (map.containsKey(Long.valueOf(j2))) {
                C2457 c2457M5958 = c5793.f19085.m5958();
                for (C0148 c0148 : (Set) map.get(Long.valueOf(j2))) {
                    c2457M5958.m4589(c0148.f585, c0148.f584);
                }
                listIterator.set(new C5793(j2, c5793.f19086, c2457M5958.m4587()));
            }
        }
        return arrayListM3607;
    }

    @Override // p000.InterfaceC5109
    /* JADX INFO: renamed from: ۥؗ */
    public Object mo3986() {
        int i = this.f16601;
        Object obj = this.f16599;
        C0474 c0474 = (C0474) this.f16600;
        switch (i) {
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                Iterable iterable = (Iterable) obj;
                C1835 c1835 = (C1835) c0474.f1722;
                c1835.getClass();
                if (iterable.iterator().hasNext()) {
                    c1835.m3610().compileStatement("DELETE FROM events WHERE _id in ".concat(C1835.m3606(iterable))).execute();
                }
                break;
            default:
                for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                    ((C1835) c0474.f1729).m3608(((Integer) entry.getValue()).intValue(), EnumC2114.f6947, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // p000.InterfaceC2740
    /* JADX INFO: renamed from: ۥۗ */
    public void mo397(InterfaceC2090 interfaceC2090) {
        InterfaceC2740 interfaceC2740 = (InterfaceC2740) this.f16600;
        InterfaceC2740 interfaceC2741 = (InterfaceC2740) this.f16599;
        interfaceC2740.mo397(interfaceC2090);
        interfaceC2741.mo397(interfaceC2090);
    }

    @Override // p000.InterfaceC0557
    /* JADX INFO: renamed from: ۥۣ */
    public boolean mo1245() {
        C2830 c2830 = (C2830) this.f16600;
        C3409 c3409 = (C3409) this.f16599;
        boolean z = c2830.f9451;
        if (z) {
            return z;
        }
        c2830.m5398();
        long jM6173 = C3409.m6173(c2830.f9465, c3409.f11344);
        c3409.f11344 = jM6173;
        boolean z2 = !c2830.m5400(c2830.f9463, jM6173 + c3409.f11343);
        c2830.f9451 = z2;
        return z2;
    }

    @Override // p000.InterfaceC1636
    /* JADX INFO: renamed from: ۦؑ */
    public Object mo3441(C4206 c4206) {
        int i = this.f16601;
        EnumC5000 enumC5000 = EnumC5000.f16543;
        Object obj = this.f16599;
        final int i2 = 0;
        Executor executor = (Executor) this.f16600;
        switch (i) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                C0411 c0411 = (C0411) obj;
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                Runnable runnable = new Runnable() { // from class: ۦٌ۟ؔۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        AtomicBoolean atomicBoolean2 = atomicBoolean;
                        switch (i3) {
                            case 0:
                                atomicBoolean2.set(true);
                                break;
                            default:
                                atomicBoolean2.set(true);
                                break;
                        }
                    }
                };
                C0914 c0914 = c4206.f13965;
                if (c0914 != null) {
                    c0914.mo3760(runnable, enumC5000);
                }
                executor.execute(new RunnableC3599(atomicBoolean, c4206, c0411, 3));
                return "setForegroundAsync";
            default:
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) obj;
                final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                final int i3 = 1;
                Runnable runnable2 = new Runnable() { // from class: ۦٌ۟ؔۘ
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i4 = i3;
                        AtomicBoolean atomicBoolean3 = atomicBoolean2;
                        switch (i4) {
                            case 0:
                                atomicBoolean3.set(true);
                                break;
                            default:
                                atomicBoolean3.set(true);
                                break;
                        }
                    }
                };
                C0914 c0915 = c4206.f13965;
                if (c0915 != null) {
                    c0915.mo3760(runnable2, enumC5000);
                }
                executor.execute(new RunnableC3599(atomicBoolean2, c4206, interfaceC4448, 6));
                return C2358.f7817;
        }
    }

    @Override // p000.InterfaceC5346
    /* JADX INFO: renamed from: ۦٌ */
    public Object mo400(C2813 c2813) {
        int i = this.f16601;
        Object obj = this.f16599;
        String str = (String) this.f16600;
        switch (i) {
            case 0:
                C5221 c5221 = (C5221) obj;
                try {
                    Trace.beginSection(str);
                    return c5221.f17238.mo400(c2813);
                } finally {
                    Trace.endSection();
                }
            default:
                Context context = (Context) c2813.mo5371(Context.class);
                int i2 = ((C5028) obj).f16642;
                String strValueOf = "";
                switch (i2) {
                    case 11:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        }
                        break;
                    case 12:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        }
                        break;
                    case 13:
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            strValueOf = FirebaseCommonRegistrar.m136(installerPackageName);
                        }
                        break;
                }
                return new C4550(str, strValueOf);
        }
    }
}
