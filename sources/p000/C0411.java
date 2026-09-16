package p000;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.UUID;

/* JADX INFO: renamed from: ۥَؔؖۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0411 implements InterfaceC4448 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f1495;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f1496;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f1497;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f1498;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f1499;

    public /* synthetic */ C0411(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f1499 = i;
        this.f1498 = obj;
        this.f1496 = obj2;
        this.f1497 = obj3;
        this.f1495 = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0154  */
    @Override // p000.InterfaceC4448
    /* JADX INFO: renamed from: ۥۣ */
    public final Object mo449() {
        Object obj = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        switch (this.f1499) {
            case 0:
                C1705 c1705 = (C1705) this.f1498;
                InterfaceC4643 interfaceC4643 = (InterfaceC4643) this.f1496;
                C5825 c5825 = (C5825) this.f1497;
                InterfaceC4448 interfaceC4448 = (InterfaceC4448) this.f1495;
                int i = 3;
                if (((EnumC0845) c1705.f5675.f14999.getValue()) == EnumC0845.f3015) {
                    if (c1705.f5675.m7862().f11319.containsKey(EnumC0845.f3013)) {
                        AbstractC2765.m5135(interfaceC4643, null, 0, new C2718((Object) c5825, (InterfaceC0443) (b3 == true ? 1 : 0), 10), 3);
                        AbstractC2765.m5135(interfaceC4643, null, 0, new C5697(c1705, b2 == true ? 1 : 0, i), 3);
                    } else {
                        AbstractC2765.m5135(interfaceC4643, null, 0, new C5697(c1705, b == true ? 1 : 0, 4), 3).mo859(new C2288(1, interfaceC4448));
                    }
                } else {
                    AbstractC2765.m5135(interfaceC4643, null, 0, new C5697(c1705, b == true ? 1 : 0, 4), 3).mo859(new C2288(1, interfaceC4448));
                }
                return C2358.f7817;
            case 1:
                C1705 c1706 = (C1705) this.f1498;
                InterfaceC0215 interfaceC0215 = (InterfaceC0215) this.f1496;
                InterfaceC0215 interfaceC0216 = (InterfaceC0215) this.f1497;
                InterfaceC0215 interfaceC0217 = (InterfaceC0215) this.f1495;
                c1706.f5671 = interfaceC0215;
                c1706.f5672 = interfaceC0216;
                c1706.f5670 = interfaceC0217;
                return C2358.f7817;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC4745 interfaceC4745 = (InterfaceC4745) this.f1498;
                ArrayList arrayList = (ArrayList) this.f1496;
                InterfaceC4367 interfaceC4367 = (InterfaceC4367) this.f1497;
                InterfaceC4367 interfaceC4368 = (InterfaceC4367) this.f1495;
                interfaceC4367.setValue(Boolean.FALSE);
                for (Object obj2 : arrayList) {
                    if (((C0346) obj2).f1277.equals(interfaceC4368.getValue())) {
                        obj = obj2;
                        interfaceC4745.mo211(obj);
                        return C2358.f7817;
                    }
                }
                interfaceC4745.mo211(obj);
                return C2358.f7817;
            default:
                C3114 c3114 = (C3114) this.f1498;
                UUID uuid = (UUID) this.f1496;
                C4716 c4716 = (C4716) this.f1497;
                Context context = (Context) this.f1495;
                String string = uuid.toString();
                C4142 c4142M378 = c3114.f10440.m378(string);
                if (c4142M378 == null || c4142M378.f13785.m8357()) {
                    C1078.m2276("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    C3654 c3654 = c3114.f10441;
                    synchronized (c3654.f12236) {
                        try {
                            C1984.m3874().m3883(C3654.f12226, "Moving WorkSpec (" + string + ") to the foreground");
                            C5789 c5789 = (C5789) c3654.f12237.remove(string);
                            if (c5789 != null) {
                                if (c3654.f12232 == null) {
                                    PowerManager.WakeLock wakeLockM7289 = AbstractC4100.m7289(c3654.f12230);
                                    c3654.f12232 = wakeLockM7289;
                                    wakeLockM7289.acquire();
                                }
                                c3654.f12229.put(string, c5789);
                                c3654.f12230.startForegroundService(C5021.m8433(c3654.f12230, AbstractC0993.m2155(c5789.f19075), c4716));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    C1860 c1860M2155 = AbstractC0993.m2155(c4142M378);
                    String str = C5021.f16609;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", c4716.f15548);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", c4716.f15547);
                    intent.putExtra("KEY_NOTIFICATION", c4716.f15546);
                    intent.putExtra("KEY_WORKSPEC_ID", c1860M2155.f6202);
                    intent.putExtra("KEY_GENERATION", c1860M2155.f6201);
                    context.startService(intent);
                }
                return null;
        }
    }
}
