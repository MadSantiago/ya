package p000;

import android.content.SharedPreferences;
import android.os.RemoteException;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import ru.bluecat.yandexmapspatcher.p003ui.App;
import ru.bluecat.yandexmapspatcher.p003ui.SideActivity;

/* JADX INFO: renamed from: ۥۙ */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0037 extends C2818 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۦۛ */
    public final /* synthetic */ int f7287;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0037(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.f7287 = i3;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:182:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:202:0x0337  */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:317:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:320:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:323:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:469:0x08c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:470:0x08c9 A[LOOP:4: B:460:0x0887->B:470:0x08c9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:500:0x08cd A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        Object value;
        Object value2;
        C1472 c1472;
        int i;
        boolean z;
        C1701 c1701;
        byte b;
        int i2;
        int i3;
        int i4;
        int i5;
        Integer numValueOf;
        int i6 = this.f7287;
        int i7 = 18;
        int i8 = 24;
        int i9 = 2;
        InterfaceC0443 interfaceC0443 = null;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        int i10 = 0;
        C2358 c2358 = C2358.f7817;
        Object obj2 = this.f11309;
        switch (i6) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                AbstractC0006 abstractC0006 = (AbstractC0006) obj2;
                C2918 c2918 = abstractC0006.f1333;
                if (zBooleanValue) {
                    abstractC0006.m9749();
                } else {
                    if (abstractC0006.f1324 != null) {
                        Object[] objArr = c2918.f9783;
                        long[] jArr = c2918.f9787;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i11 = 0;
                            while (true) {
                                long j = jArr[i11];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                                    for (int i13 = 0; i13 < i12; i13++) {
                                        if ((j & 255) < 128) {
                                            AbstractC2765.m5135(abstractC0006.m9076(), null, 0, new C0068(abstractC0006, (C3656) objArr[(i11 << 3) + i13], interfaceC0443, i10), 3);
                                        }
                                        j >>= 8;
                                    }
                                    if (i12 == 8) {
                                        if (i11 != length) {
                                            i11++;
                                        }
                                    }
                                } else if (i11 != length) {
                                    i11++;
                                }
                            }
                        }
                        C3656 c3656 = abstractC0006.f1329;
                        if (c3656 != null) {
                            AbstractC2765.m5135(abstractC0006.m9076(), null, 0, new C0068(abstractC0006, c3656, interfaceC0443, 1), 3);
                        }
                    }
                    c2918.m5502();
                    abstractC0006.f1329 = null;
                    abstractC0006.mo9755();
                }
                return c2358;
            case 1:
                ((C5327) obj2).getClass();
                ((C3751) obj).m6591(new C0086(9));
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                ((C4186) obj2).getClass();
                ((C3751) obj).m6591(new C0086(16));
                return c2358;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                ((C0689) obj2).getClass();
                ((C3751) obj).m6593(new C0086(17));
                return c2358;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                AbstractC1733 abstractC1733 = (AbstractC1733) obj2;
                abstractC1733.getClass();
                ((C3751) obj).m6593(new C3565(abstractC1733, z3 ? 1 : 0));
                return c2358;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                ((C2058) obj2).getClass();
                ((C3751) obj).m6593(new C3018(i9));
                return c2358;
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                ((C4678) obj2).getClass();
                ((C3751) obj).m6591(new C3018(11));
                return c2358;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                ((C2173) obj2).getClass();
                ((C3751) obj).m6591(new C3018(26));
                return c2358;
            case 8:
                ((C3382) obj2).getClass();
                ((C3751) obj).m6593(new C2582(i10));
                return c2358;
            case 9:
                ((C3913) obj2).getClass();
                ((C3751) obj).m6593(new C2582((int) (z4 ? 1 : 0)));
                return c2358;
            case 10:
                ((C4661) obj2).getClass();
                ((C3751) obj).m6593(new C2582(14));
                return c2358;
            case 11:
                ((C4979) obj2).getClass();
                ((C3751) obj).m6593(new C2582(21));
                return c2358;
            case 12:
                Set set = (Set) obj;
                C4775 c4775 = (C4775) obj2;
                ReentrantLock reentrantLock = c4775.f15740;
                reentrantLock.lock();
                try {
                    List<C2916> listM2039 = AbstractC0973.m2039(c4775.f15745.values());
                    reentrantLock.unlock();
                    for (C2916 c2916 : listM2039) {
                        int[] iArr = c2916.f9722;
                        int length2 = iArr.length;
                        Collection collectionM8152 = C1590.f5346;
                        if (length2 != 0) {
                            if (length2 != 1) {
                                C0232 c0232 = new C0232();
                                int length3 = iArr.length;
                                int i14 = 0;
                                int i15 = 0;
                                while (i14 < length3) {
                                    int i16 = i15 + 1;
                                    if (set.contains(Integer.valueOf(iArr[i14]))) {
                                        c0232.add(c2916.f9721[i15]);
                                    }
                                    i14++;
                                    i15 = i16;
                                }
                                collectionM8152 = C4773.m8152(c0232);
                            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                                collectionM8152 = c2916.f9724;
                            }
                        }
                        if (!collectionM8152.isEmpty()) {
                            C5024 c5024 = (C5024) c2916.f9723.f11254;
                            if (!c5024.f16624.get()) {
                                try {
                                    InterfaceC2376 interfaceC2376 = c5024.f16633;
                                    if (interfaceC2376 != null) {
                                        interfaceC2376.mo4449(c5024.f16625, (String[]) collectionM8152.toArray(new String[0]));
                                    }
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                                }
                            }
                        }
                    }
                    return c2358;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 13:
                ((AbstractC5752) obj2).mo923((Throwable) obj);
                return c2358;
            case 14:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                C4994 c4994 = ((C5648) obj2).f18601;
                do {
                    value = c4994.getValue();
                } while (!c4994.m8386(value, C1966.m3846((C1966) value, null, false, 0, false, false, null, false, false, zBooleanValue2, 255)));
                return c2358;
            case 15:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                C4994 c4995 = ((C5081) obj2).f16852.f6235;
                do {
                    value2 = c4995.getValue();
                } while (!c4995.m8386(value2, C3584.m6401((C3584) value2, zBooleanValue3, null, 2)));
                return c2358;
            case 16:
                ((C4966) obj2).getClass();
                ((C3751) obj).m6591(new C4618(i8));
                return c2358;
            case 17:
                ((C1659) obj2).getClass();
                ((C3751) obj).m6593(new C1797(19));
                return c2358;
            case 18:
                ((C4700) obj2).getClass();
                ((C3751) obj).m6591(new C1797(i8));
                return c2358;
            case 19:
                ((C5289) obj2).getClass();
                ((C3751) obj).m6593(new C4215(15));
                return c2358;
            case 20:
                C0346 c0346 = (C0346) obj;
                ((C3557) obj2).getClass();
                App app = App.f407;
                C1443 c1443 = AbstractC2776.m5217().f410;
                C1542 c1542 = AbstractC2539.f8442;
                Object obj3 = c1542.f5218;
                String str = c1542.f5219;
                boolean z5 = C1443.f4940;
                if (((String) c1443.m3068(obj3, str)).equals(c0346.f1277)) {
                    c1443 = null;
                }
                if (c1443 != null) {
                    C2518 c2518 = new C2518(c1443);
                    c2518.m4661(c0346.f1277, str);
                    SharedPreferences.Editor editor = c2518.f8351;
                    if (editor != null) {
                        editor.apply();
                    }
                    if (!C1443.f4940 && !c1443.f4943) {
                        try {
                            AbstractC2765.m5147(c1443.f4945, c1443.m3070().concat(".xml"));
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                    C0649 c0649 = AbstractC0912.f3276;
                    AbstractC2765.m5135(AbstractC4009.m7151(AbstractC5794.f19088), null, 0, new C4564(i9, interfaceC0443, 3), 3);
                    SideActivity sideActivity = SideActivity.f416;
                    AbstractC4489.m7812().finishAffinity();
                }
                return c2358;
            case 21:
                ((C3557) obj2).getClass();
                C0649 c06410 = AbstractC0912.f3276;
                AbstractC2765.m5135(AbstractC4009.m7151(AbstractC5794.f19088), null, 0, new C0876((C0346) obj, interfaceC0443, 5), 3);
                return c2358;
            case 22:
                long j2 = ((C1553) obj).f5241;
                C5097 c5097 = (C5097) obj2;
                c5097.getClass();
                InterfaceC0884 interfaceC0884 = (InterfaceC0884) AbstractC2552.m4807(c5097, AbstractC0405.f1488);
                if (interfaceC0884 != null) {
                    AbstractC2765.m5135(c5097.m9076(), null, 0, new C0058(c5097, j2, interfaceC0884, new C0357(c5097, j2), (InterfaceC0443) null), 3);
                }
                return c2358;
            case 23:
                ((C5091) obj2).f16884.m5079((InterfaceC4745) obj);
                return c2358;
            case 24:
                KeyEvent keyEvent = ((C2581) obj).f8625;
                C5678 c5678 = (C5678) obj2;
                C1701 c1702 = c5678.f18668;
                boolean z6 = c5678.f18672;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    c1472 = null;
                } else {
                    C5517 c5517 = c5678.f18674;
                    c5517.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((unicodeChar & Integer.MIN_VALUE) != 0) {
                        c5517.f18203 = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = c5517.f18203;
                        if (num != null) {
                            c5517.f18203 = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        c1472 = new C1472(1, new StringBuilder().appendCodePoint(numValueOf.intValue()).toString());
                    } else {
                        c1472 = null;
                    }
                }
                if (c1472 != null) {
                    if (z6) {
                        c5678.m9497(Collections.singletonList(c1472));
                        c1702.f5666 = null;
                    } else {
                        z2 = false;
                    }
                } else if (AbstractC1434.m3056(keyEvent) == 2) {
                    C4036 c4036 = AbstractC3925.f13086;
                    int iM1935 = AbstractC0949.m1935(keyEvent);
                    int i17 = AbstractC3925.f13102;
                    if (iM1935 == 9) {
                        long jM3422 = AbstractC1631.m3422(keyEvent.getKeyCode());
                        if (AbstractC0708.m1574(jM3422, AbstractC0708.f2578)) {
                            i5 = 42;
                        } else if (AbstractC0708.m1574(jM3422, AbstractC0708.f2605)) {
                            i5 = 43;
                        } else if (AbstractC0708.m1574(jM3422, AbstractC0708.f2591)) {
                            i5 = 34;
                        } else if (AbstractC0708.m1574(jM3422, AbstractC0708.f2577)) {
                            i5 = 35;
                        } else {
                            i = 0;
                        }
                        i = i5;
                    } else if (iM1935 == 1) {
                        long jM3423 = AbstractC1631.m3422(keyEvent.getKeyCode());
                        if (AbstractC0708.m1574(jM3423, AbstractC0708.f2578)) {
                            i = 9;
                        } else if (AbstractC0708.m1574(jM3423, AbstractC0708.f2605)) {
                            i = 10;
                        } else if (AbstractC0708.m1574(jM3423, AbstractC0708.f2591)) {
                            i = 16;
                        } else if (AbstractC0708.m1574(jM3423, AbstractC0708.f2577)) {
                            i = 17;
                        } else if (AbstractC0708.m1574(jM3423, AbstractC0708.f2576)) {
                            i = 25;
                        } else {
                            i = 0;
                        }
                    } else {
                        i = 0;
                    }
                    if (i == 0) {
                        C5086 c5086 = AbstractC1434.f4917;
                        int i18 = AbstractC3925.f13104;
                        int iM1936 = AbstractC0949.m1935(keyEvent);
                        long jM3424 = AbstractC1631.m3422(keyEvent.getKeyCode());
                        z = z6;
                        if (AbstractC0708.m1574(jM3424, AbstractC0708.f2576)) {
                            if (iM1936 != 0 && iM1936 != 8) {
                                int i19 = AbstractC3925.f13103;
                                if (iM1936 != 12) {
                                    if (iM1936 == 2 || iM1936 == 10) {
                                        i3 = 23;
                                        c1701 = c1702;
                                        i2 = 10;
                                    } else {
                                        i2 = 10;
                                        c1701 = c1702;
                                        i3 = 0;
                                    }
                                }
                            }
                            c1701 = c1702;
                            i2 = 10;
                            i3 = 21;
                        } else {
                            c1701 = c1702;
                            if (AbstractC0708.m1574(jM3424, AbstractC0708.f2580) || AbstractC0708.m1574(jM3424, AbstractC0708.f2581)) {
                                if (iM1936 == 0 || iM1936 == 8 || iM1936 == 2) {
                                    i2 = 10;
                                } else {
                                    i2 = 10;
                                    if (iM1936 != 10) {
                                        i3 = 0;
                                    }
                                }
                                i3 = 45;
                            } else {
                                i3 = 0;
                                i2 = 10;
                            }
                        }
                        if (i3 == 0) {
                            int iM1937 = AbstractC0949.m1935(keyEvent);
                            if (iM1937 == i2) {
                                long jM3425 = AbstractC1631.m3422(keyEvent.getKeyCode());
                                if (AbstractC0708.m1574(jM3425, AbstractC0708.f2578) || AbstractC0708.m1574(jM3425, AbstractC0708.f2592)) {
                                    i4 = 36;
                                } else if (AbstractC0708.m1574(jM3425, AbstractC0708.f2605) || AbstractC0708.m1574(jM3425, AbstractC0708.f2589)) {
                                    i4 = 37;
                                } else if (AbstractC0708.m1574(jM3425, AbstractC0708.f2591) || AbstractC0708.m1574(jM3425, AbstractC0708.f2586)) {
                                    i4 = 39;
                                } else if (AbstractC0708.m1574(jM3425, AbstractC0708.f2577) || AbstractC0708.m1574(jM3425, AbstractC0708.f2594)) {
                                    i4 = 38;
                                } else {
                                    i4 = 0;
                                }
                            } else if (iM1937 == 2) {
                                long jM3426 = AbstractC1631.m3422(keyEvent.getKeyCode());
                                if (AbstractC0708.m1574(jM3426, AbstractC0708.f2578) || AbstractC0708.m1574(jM3426, AbstractC0708.f2592)) {
                                    i4 = 4;
                                } else if (AbstractC0708.m1574(jM3426, AbstractC0708.f2605) || AbstractC0708.m1574(jM3426, AbstractC0708.f2589)) {
                                    i4 = 3;
                                } else if (AbstractC0708.m1574(jM3426, AbstractC0708.f2591) || AbstractC0708.m1574(jM3426, AbstractC0708.f2586)) {
                                    i4 = 6;
                                } else if (AbstractC0708.m1574(jM3426, AbstractC0708.f2577) || AbstractC0708.m1574(jM3426, AbstractC0708.f2594)) {
                                    i4 = 5;
                                } else if (AbstractC0708.m1574(jM3426, AbstractC0708.f2604)) {
                                    i4 = 21;
                                } else if (AbstractC0708.m1574(jM3426, AbstractC0708.f2582)) {
                                    i4 = 24;
                                } else if (AbstractC0708.m1574(jM3426, AbstractC0708.f2590)) {
                                    i4 = 44;
                                } else {
                                    i4 = 0;
                                }
                            } else if (iM1937 == 8) {
                                long jM3427 = AbstractC1631.m3422(keyEvent.getKeyCode());
                                if (AbstractC0708.m1574(jM3427, AbstractC0708.f2607) || AbstractC0708.m1574(jM3427, AbstractC0708.f2593)) {
                                    i4 = 40;
                                } else if (AbstractC0708.m1574(jM3427, AbstractC0708.f2584) || AbstractC0708.m1574(jM3427, AbstractC0708.f2597)) {
                                    i4 = 41;
                                } else {
                                    i4 = 0;
                                }
                            } else if (iM1937 == 1 && AbstractC0708.m1574(AbstractC1631.m3422(keyEvent.getKeyCode()), AbstractC0708.f2582)) {
                                i4 = 26;
                            } else {
                                i4 = 0;
                            }
                            if (i4 == 0) {
                                Object obj4 = c5086.f16877;
                                int iM1938 = AbstractC0949.m1935(keyEvent);
                                if (iM1938 == 10) {
                                    if (AbstractC0708.m1574(AbstractC1631.m3422(keyEvent.getKeyCode()), AbstractC0708.f2611)) {
                                        i3 = 48;
                                    } else {
                                        i3 = 0;
                                    }
                                } else if (iM1938 == 2) {
                                    long jM3428 = AbstractC1631.m3422(keyEvent.getKeyCode());
                                    if (AbstractC0708.m1574(jM3428, AbstractC0708.f2598) || AbstractC0708.m1574(jM3428, AbstractC0708.f2599) || AbstractC0708.m1574(jM3428, AbstractC0708.f2608)) {
                                        i3 = 18;
                                    } else if (AbstractC0708.m1574(jM3428, AbstractC0708.f2595)) {
                                        i3 = 19;
                                    } else if (AbstractC0708.m1574(jM3428, AbstractC0708.f2596)) {
                                        i3 = 20;
                                    } else if (AbstractC0708.m1574(jM3428, AbstractC0708.f2603)) {
                                        i3 = 27;
                                    } else if (AbstractC0708.m1574(jM3428, AbstractC0708.f2606)) {
                                        i3 = 48;
                                    } else if (AbstractC0708.m1574(jM3428, AbstractC0708.f2611)) {
                                        i3 = 47;
                                    } else {
                                        i3 = 0;
                                    }
                                } else if (iM1938 == 8) {
                                    long jM3429 = AbstractC1631.m3422(keyEvent.getKeyCode());
                                    if (AbstractC0708.m1574(jM3429, AbstractC0708.f2578) || AbstractC0708.m1574(jM3429, AbstractC0708.f2592)) {
                                        i3 = 28;
                                    } else if (AbstractC0708.m1574(jM3429, AbstractC0708.f2605) || AbstractC0708.m1574(jM3429, AbstractC0708.f2589)) {
                                        i3 = 29;
                                    } else if (AbstractC0708.m1574(jM3429, AbstractC0708.f2591) || AbstractC0708.m1574(jM3429, AbstractC0708.f2586)) {
                                        i3 = 30;
                                    } else if (AbstractC0708.m1574(jM3429, AbstractC0708.f2577) || AbstractC0708.m1574(jM3429, AbstractC0708.f2594)) {
                                        i3 = 31;
                                    } else if (AbstractC0708.m1574(jM3429, AbstractC0708.f2575) || AbstractC0708.m1574(jM3429, AbstractC0708.f2600)) {
                                        i3 = 32;
                                    } else if (AbstractC0708.m1574(jM3429, AbstractC0708.f2602) || AbstractC0708.m1574(jM3429, AbstractC0708.f2572)) {
                                        i3 = 33;
                                    } else if (AbstractC0708.m1574(jM3429, AbstractC0708.f2607) || AbstractC0708.m1574(jM3429, AbstractC0708.f2593)) {
                                        i3 = 40;
                                    } else if (AbstractC0708.m1574(jM3429, AbstractC0708.f2584) || AbstractC0708.m1574(jM3429, AbstractC0708.f2597)) {
                                        i3 = 41;
                                    } else if (AbstractC0708.m1574(jM3429, AbstractC0708.f2599) || AbstractC0708.m1574(jM3429, AbstractC0708.f2608)) {
                                        i3 = 19;
                                    } else {
                                        i3 = 0;
                                    }
                                } else if (iM1938 == 0) {
                                    long jM34210 = AbstractC1631.m3422(keyEvent.getKeyCode());
                                    if (AbstractC0708.m1574(jM34210, AbstractC0708.f2578) || AbstractC0708.m1574(jM34210, AbstractC0708.f2592)) {
                                        i3 = 1;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2605) || AbstractC0708.m1574(jM34210, AbstractC0708.f2589)) {
                                        i3 = 2;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2591) || AbstractC0708.m1574(jM34210, AbstractC0708.f2586)) {
                                        i3 = 11;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2577) || AbstractC0708.m1574(jM34210, AbstractC0708.f2594)) {
                                        i3 = 12;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2587)) {
                                        i3 = 13;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2575) || AbstractC0708.m1574(jM34210, AbstractC0708.f2600)) {
                                        i3 = 14;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2602) || AbstractC0708.m1574(jM34210, AbstractC0708.f2572)) {
                                        i3 = 15;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2607) || AbstractC0708.m1574(jM34210, AbstractC0708.f2593)) {
                                        i3 = 7;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2584) || AbstractC0708.m1574(jM34210, AbstractC0708.f2597)) {
                                        i3 = 8;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2580) || AbstractC0708.m1574(jM34210, AbstractC0708.f2581)) {
                                        i3 = 45;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2576)) {
                                        i3 = 21;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2582)) {
                                        i3 = 22;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2571)) {
                                        i3 = 19;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2583)) {
                                        i3 = 20;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2573)) {
                                        i3 = 18;
                                    } else if (AbstractC0708.m1574(jM34210, AbstractC0708.f2609)) {
                                        i3 = 46;
                                    } else {
                                        i3 = 0;
                                    }
                                } else {
                                    i3 = 0;
                                }
                                i = i3;
                            } else {
                                i = i4;
                            }
                        } else {
                            i = i3;
                        }
                    } else {
                        z = z6;
                        c1701 = c1702;
                    }
                    int i20 = i;
                    if (i20 != 0) {
                        switch (i20) {
                            case 1:
                            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            case C4261.LONG_FIELD_NUMBER /* 4 */:
                            case C4261.STRING_FIELD_NUMBER /* 5 */:
                            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                                b = false;
                                break;
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                b = true;
                                break;
                            default:
                                throw null;
                        }
                        if (!b == true || z) {
                            C5662 c5662 = new C5662();
                            c5662.f18631 = true;
                            C5153 c5153 = new C5153(i20, c5678, c5662);
                            C5745 c5745 = c5678.f18666;
                            C1667 c1667 = new C1667(c5745, c5678.f18676, c5678.f18671.m9648(), c1701);
                            c5153.mo211(c1667);
                            if (!C3346.m6110(c1667.f5553, c5745.f18943) || !AbstractC3831.m6874(c1667.f5559, c5745.f18944)) {
                                c5678.f18673.mo211(C5745.m9570(c5745, c1667.f5559, c1667.f5553, 4));
                            }
                            c5678.f18670.f10938 = true;
                            z2 = c5662.f18631;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            default:
                ((C3578) obj2).getClass();
                ((C3751) obj).m6593(new C3875(i7));
                return c2358;
        }
    }
}
