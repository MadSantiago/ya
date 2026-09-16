package p000;

import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import ru.bluecat.yandexmapspatcher.R;

/* JADX INFO: renamed from: ۥًؔۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0837 extends C4228 {

    /* JADX INFO: renamed from: ۥٖ */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC2392 f2987;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0837(ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392) {
        super(3);
        this.f2987 = viewOnAttachStateChangeListenerC2392;
    }

    @Override // p000.C4228
    /* JADX INFO: renamed from: ۥَ */
    public final C5817 mo1743(int i) {
        ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392 = this.f2987;
        if (i != 1) {
            if (i == 2) {
                return mo1746(viewOnAttachStateChangeListenerC2392.f7938);
            }
            C1078.m2272(AbstractC5078.m8670(i, "Unknown focus type: "));
            return null;
        }
        int i2 = viewOnAttachStateChangeListenerC2392.f7929;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo1746(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:159:0x0263  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0058  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c  */
    /* JADX WARN: Code duplicated, block: B:271:0x0432  */
    /* JADX WARN: Code duplicated, block: B:272:0x0434  */
    /* JADX WARN: Code duplicated, block: B:275:0x0439  */
    /* JADX WARN: Code duplicated, block: B:276:0x043b  */
    /* JADX WARN: Code duplicated, block: B:279:0x0441  */
    /* JADX WARN: Code duplicated, block: B:280:0x0443  */
    /* JADX WARN: Code duplicated, block: B:283:0x0449  */
    /* JADX WARN: Code duplicated, block: B:284:0x044b  */
    /* JADX WARN: Code duplicated, block: B:287:0x0451  */
    /* JADX WARN: Code duplicated, block: B:288:0x0453  */
    /* JADX WARN: Code duplicated, block: B:291:0x0459  */
    /* JADX WARN: Code duplicated, block: B:292:0x045b  */
    /* JADX WARN: Code duplicated, block: B:299:0x0467  */
    /* JADX WARN: Code duplicated, block: B:308:0x0476  */
    /* JADX WARN: Code duplicated, block: B:310:0x047e  */
    /* JADX WARN: Code duplicated, block: B:313:0x0489  */
    /* JADX WARN: Code duplicated, block: B:316:0x048e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:324:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:326:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:329:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:334:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:337:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:341:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:343:0x0502  */
    /* JADX WARN: Code duplicated, block: B:346:0x0507 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:386:0x0583  */
    /* JADX WARN: Code duplicated, block: B:389:0x058d  */
    /* JADX WARN: Code duplicated, block: B:392:0x0592 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:394:0x0596  */
    /* JADX WARN: Code duplicated, block: B:395:0x059b  */
    /* JADX WARN: Code duplicated, block: B:397:0x05a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:398:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:401:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:403:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:410:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:412:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:414:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:415:0x05df  */
    /* JADX WARN: Code duplicated, block: B:417:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:419:0x05e9  */
    /* JADX WARN: Code duplicated, block: B:420:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:423:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:490:0x06d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:491:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:493:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:494:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:498:0x06ee  */
    /* JADX WARN: Code duplicated, block: B:500:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:503:0x0702  */
    /* JADX WARN: Code duplicated, block: B:508:0x0710  */
    /* JADX WARN: Code duplicated, block: B:520:0x0727  */
    /* JADX WARN: Code duplicated, block: B:525:0x0739  */
    /* JADX WARN: Code duplicated, block: B:532:0x074b  */
    /* JADX WARN: Code duplicated, block: B:534:0x074f  */
    /* JADX WARN: Code duplicated, block: B:536:0x075c  */
    /* JADX WARN: Code duplicated, block: B:538:0x0760  */
    /* JADX WARN: Code duplicated, block: B:551:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:553:0x07c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:554:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:555:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:558:0x07d0  */
    /* JADX WARN: Code duplicated, block: B:559:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:562:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:564:0x07e5  */
    /* JADX WARN: Code duplicated, block: B:576:0x0806 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:577:0x0808  */
    /* JADX WARN: Code duplicated, block: B:578:0x080a  */
    /* JADX WARN: Code duplicated, block: B:581:0x080e  */
    /* JADX WARN: Code duplicated, block: B:582:0x0810  */
    /* JADX WARN: Code duplicated, block: B:585:0x0824  */
    /* JADX WARN: Code duplicated, block: B:587:0x0829  */
    /* JADX WARN: Code duplicated, block: B:589:0x0839 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:591:0x083c  */
    /* JADX WARN: Code duplicated, block: B:96:0x013f  */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x01b3, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x005c, please report this as an issue */
    @Override // p000.C4228
    /* JADX INFO: renamed from: ۥۖ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo1744(int r23, int r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 2232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0837.mo1744(int, int, android.os.Bundle):boolean");
    }

    @Override // p000.C4228
    /* JADX INFO: renamed from: ۦۗ */
    public final void mo1745(int i, C5817 c5817, String str, Bundle bundle) {
        this.f2987.m4490(i, c5817, str, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:106:0x0213  */
    /* JADX WARN: Code duplicated, block: B:107:0x021d  */
    /* JADX WARN: Code duplicated, block: B:110:0x022c  */
    /* JADX WARN: Code duplicated, block: B:112:0x024a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0253  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:121:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:127:0x02d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:129:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:131:0x02db  */
    /* JADX WARN: Code duplicated, block: B:132:0x02de  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:140:0x0301  */
    /* JADX WARN: Code duplicated, block: B:142:0x030b  */
    /* JADX WARN: Code duplicated, block: B:145:0x031c  */
    /* JADX WARN: Code duplicated, block: B:148:0x034f  */
    /* JADX WARN: Code duplicated, block: B:151:0x035a  */
    /* JADX WARN: Code duplicated, block: B:153:0x036a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0388  */
    /* JADX WARN: Code duplicated, block: B:162:0x0390  */
    /* JADX WARN: Code duplicated, block: B:164:0x03a2 A[LOOP:3: B:161:0x038e->B:164:0x03a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:171:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:179:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:181:0x040c  */
    /* JADX WARN: Code duplicated, block: B:185:0x042f  */
    /* JADX WARN: Code duplicated, block: B:187:0x043d  */
    /* JADX WARN: Code duplicated, block: B:189:0x0444  */
    /* JADX WARN: Code duplicated, block: B:191:0x0455  */
    /* JADX WARN: Code duplicated, block: B:193:0x0467  */
    /* JADX WARN: Code duplicated, block: B:195:0x0471  */
    /* JADX WARN: Code duplicated, block: B:197:0x0481  */
    /* JADX WARN: Code duplicated, block: B:200:0x048f  */
    /* JADX WARN: Code duplicated, block: B:203:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:205:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:207:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:210:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:211:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:217:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:219:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:220:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:222:0x0500  */
    /* JADX WARN: Code duplicated, block: B:225:0x050c  */
    /* JADX WARN: Code duplicated, block: B:228:0x0512  */
    /* JADX WARN: Code duplicated, block: B:230:0x0518  */
    /* JADX WARN: Code duplicated, block: B:231:0x051c  */
    /* JADX WARN: Code duplicated, block: B:233:0x0523  */
    /* JADX WARN: Code duplicated, block: B:236:0x052d  */
    /* JADX WARN: Code duplicated, block: B:241:0x053f  */
    /* JADX WARN: Code duplicated, block: B:243:0x0547  */
    /* JADX WARN: Code duplicated, block: B:246:0x054d  */
    /* JADX WARN: Code duplicated, block: B:247:0x0554  */
    /* JADX WARN: Code duplicated, block: B:251:0x0561  */
    /* JADX WARN: Code duplicated, block: B:254:0x0567  */
    /* JADX WARN: Code duplicated, block: B:256:0x056a  */
    /* JADX WARN: Code duplicated, block: B:259:0x0581 A[LOOP:7: B:255:0x0568->B:259:0x0581, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:262:0x0589  */
    /* JADX WARN: Code duplicated, block: B:265:0x0594  */
    /* JADX WARN: Code duplicated, block: B:268:0x059c  */
    /* JADX WARN: Code duplicated, block: B:270:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:271:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:272:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:275:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:278:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:27:0x0088  */
    /* JADX WARN: Code duplicated, block: B:280:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:281:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:284:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:286:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:287:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:290:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:293:0x060b  */
    /* JADX WARN: Code duplicated, block: B:296:0x0611  */
    /* JADX WARN: Code duplicated, block: B:297:0x0616  */
    /* JADX WARN: Code duplicated, block: B:300:0x0630  */
    /* JADX WARN: Code duplicated, block: B:302:0x0643  */
    /* JADX WARN: Code duplicated, block: B:304:0x064d  */
    /* JADX WARN: Code duplicated, block: B:305:0x0654  */
    /* JADX WARN: Code duplicated, block: B:308:0x0665  */
    /* JADX WARN: Code duplicated, block: B:309:0x066a  */
    /* JADX WARN: Code duplicated, block: B:312:0x0675  */
    /* JADX WARN: Code duplicated, block: B:315:0x0681  */
    /* JADX WARN: Code duplicated, block: B:318:0x0687  */
    /* JADX WARN: Code duplicated, block: B:31:0x0094  */
    /* JADX WARN: Code duplicated, block: B:321:0x0697  */
    /* JADX WARN: Code duplicated, block: B:324:0x069d  */
    /* JADX WARN: Code duplicated, block: B:326:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:330:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:333:0x06b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:340:0x06c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:344:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:347:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    /* JADX WARN: Code duplicated, block: B:352:0x06f0  */
    /* JADX WARN: Code duplicated, block: B:355:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:357:0x0700  */
    /* JADX WARN: Code duplicated, block: B:360:0x0714  */
    /* JADX WARN: Code duplicated, block: B:363:0x071a  */
    /* JADX WARN: Code duplicated, block: B:366:0x072c  */
    /* JADX WARN: Code duplicated, block: B:368:0x0734  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:371:0x073a  */
    /* JADX WARN: Code duplicated, block: B:374:0x074e  */
    /* JADX WARN: Code duplicated, block: B:377:0x0754  */
    /* JADX WARN: Code duplicated, block: B:380:0x0769  */
    /* JADX WARN: Code duplicated, block: B:383:0x076f  */
    /* JADX WARN: Code duplicated, block: B:386:0x0785  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:390:0x0799  */
    /* JADX WARN: Code duplicated, block: B:391:0x07a0  */
    /* JADX WARN: Code duplicated, block: B:393:0x07a3  */
    /* JADX WARN: Code duplicated, block: B:396:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:401:0x07d5  */
    /* JADX WARN: Code duplicated, block: B:402:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:405:0x07fb  */
    /* JADX WARN: Code duplicated, block: B:407:0x0801  */
    /* JADX WARN: Code duplicated, block: B:416:0x0822  */
    /* JADX WARN: Code duplicated, block: B:418:0x0828  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:426:0x0841  */
    /* JADX WARN: Code duplicated, block: B:428:0x0847  */
    /* JADX WARN: Code duplicated, block: B:430:0x084f  */
    /* JADX WARN: Code duplicated, block: B:432:0x0856  */
    /* JADX WARN: Code duplicated, block: B:435:0x085a  */
    /* JADX WARN: Code duplicated, block: B:438:0x0873  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:446:0x088f  */
    /* JADX WARN: Code duplicated, block: B:449:0x089c  */
    /* JADX WARN: Code duplicated, block: B:452:0x08be  */
    /* JADX WARN: Code duplicated, block: B:454:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:455:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:458:0x08d5  */
    /* JADX WARN: Code duplicated, block: B:461:0x08e3  */
    /* JADX WARN: Code duplicated, block: B:464:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:469:0x0911  */
    /* JADX WARN: Code duplicated, block: B:472:0x0917  */
    /* JADX WARN: Code duplicated, block: B:473:0x0924  */
    /* JADX WARN: Code duplicated, block: B:475:0x0937  */
    /* JADX WARN: Code duplicated, block: B:477:0x093b  */
    /* JADX WARN: Code duplicated, block: B:479:0x0947  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:481:0x095b  */
    /* JADX WARN: Code duplicated, block: B:485:0x0967  */
    /* JADX WARN: Code duplicated, block: B:487:0x096d  */
    /* JADX WARN: Code duplicated, block: B:488:0x096f  */
    /* JADX WARN: Code duplicated, block: B:490:0x0975  */
    /* JADX WARN: Code duplicated, block: B:492:0x097b  */
    /* JADX WARN: Code duplicated, block: B:496:0x0999 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:499:0x09a9  */
    /* JADX WARN: Code duplicated, block: B:501:0x09ad  */
    /* JADX WARN: Code duplicated, block: B:503:0x09bb  */
    /* JADX WARN: Code duplicated, block: B:506:0x09c0  */
    /* JADX WARN: Code duplicated, block: B:509:0x09d5  */
    /* JADX WARN: Code duplicated, block: B:50:0x0104  */
    /* JADX WARN: Code duplicated, block: B:512:0x09df  */
    /* JADX WARN: Code duplicated, block: B:514:0x09e7  */
    /* JADX WARN: Code duplicated, block: B:516:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:517:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:519:0x09fb  */
    /* JADX WARN: Code duplicated, block: B:522:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:524:0x0a0c  */
    /* JADX WARN: Code duplicated, block: B:525:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:529:0x0a1e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:532:0x0a2e  */
    /* JADX WARN: Code duplicated, block: B:534:0x0a32  */
    /* JADX WARN: Code duplicated, block: B:536:0x0a40  */
    /* JADX WARN: Code duplicated, block: B:539:0x0a45  */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:542:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:545:0x0a64  */
    /* JADX WARN: Code duplicated, block: B:547:0x0a6a  */
    /* JADX WARN: Code duplicated, block: B:550:0x0a7a  */
    /* JADX WARN: Code duplicated, block: B:553:0x0a8a  */
    /* JADX WARN: Code duplicated, block: B:556:0x0a99  */
    /* JADX WARN: Code duplicated, block: B:557:0x0a9d  */
    /* JADX WARN: Code duplicated, block: B:560:0x0aac  */
    /* JADX WARN: Code duplicated, block: B:562:0x0ab6  */
    /* JADX WARN: Code duplicated, block: B:565:0x0acc  */
    /* JADX WARN: Code duplicated, block: B:568:0x0ae2  */
    /* JADX WARN: Code duplicated, block: B:56:0x0117  */
    /* JADX WARN: Code duplicated, block: B:571:0x0af6  */
    /* JADX WARN: Code duplicated, block: B:573:0x0b06  */
    /* JADX WARN: Code duplicated, block: B:575:0x0b1c  */
    /* JADX WARN: Code duplicated, block: B:577:0x0b2f  */
    /* JADX WARN: Code duplicated, block: B:579:0x0b3a  */
    /* JADX WARN: Code duplicated, block: B:580:0x0b4d  */
    /* JADX WARN: Code duplicated, block: B:584:0x0b64  */
    /* JADX WARN: Code duplicated, block: B:587:0x0b6b  */
    /* JADX WARN: Code duplicated, block: B:589:0x0b75  */
    /* JADX WARN: Code duplicated, block: B:58:0x011f  */
    /* JADX WARN: Code duplicated, block: B:591:0x0b78  */
    /* JADX WARN: Code duplicated, block: B:593:0x0b7e  */
    /* JADX WARN: Code duplicated, block: B:595:0x0b87  */
    /* JADX WARN: Code duplicated, block: B:598:0x0b97  */
    /* JADX WARN: Code duplicated, block: B:600:0x0ba2  */
    /* JADX WARN: Code duplicated, block: B:604:0x0bbf  */
    /* JADX WARN: Code duplicated, block: B:605:0x0bc3  */
    /* JADX WARN: Code duplicated, block: B:608:0x0bd0  */
    /* JADX WARN: Code duplicated, block: B:610:0x0bda  */
    /* JADX WARN: Code duplicated, block: B:611:0x0be0  */
    /* JADX WARN: Code duplicated, block: B:613:0x0bed  */
    /* JADX WARN: Code duplicated, block: B:616:0x0bfa  */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:621:0x0c16  */
    /* JADX WARN: Code duplicated, block: B:632:0x0c2b  */
    /* JADX WARN: Code duplicated, block: B:636:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:640:0x0328 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x03b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0138  */
    /* JADX WARN: Code duplicated, block: B:653:0x0416 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:0x0576 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:0x0586 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:661:0x083d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:0x0838 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:670:0x095e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x0159  */
    /* JADX WARN: Code duplicated, block: B:74:0x016a  */
    /* JADX WARN: Code duplicated, block: B:75:0x016e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0188  */
    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX WARN: Code duplicated, block: B:80:0x018e  */
    /* JADX WARN: Code duplicated, block: B:83:0x019e  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f9  */
    /* JADX WARN: Instruction removed from duplicated block: B:632:0x0c2b, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v28, types: [ۥۛؗۗۚ] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v69, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v78, types: [java.util.ArrayList] */
    @Override // p000.C4228
    /* JADX INFO: renamed from: ۦۚ */
    public final C5817 mo1746(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain;
        C5817 c5817;
        int i2;
        C3129 c3129M5766;
        Integer numValueOf;
        int iIntValue;
        C5251 c5251;
        C1870 c1870;
        Resources resources;
        C2542 c2542;
        C3262 c3262;
        Object objM6027;
        C2155 c2155;
        AccessibilityManager accessibilityManager;
        C1870 c1871;
        boolean zM179;
        List listM5756;
        int size;
        boolean z;
        int i3;
        int i4;
        int i5;
        AccessibilityNodeInfo accessibilityNodeInfo;
        C1249 c1249M3369;
        C2542 c2543;
        C2155 c2156;
        C3262 c3263;
        AccessibilityNodeInfo accessibilityNodeInfo2;
        C5817 c5818;
        SpannableString spannableString;
        AccessibilityNodeInfo accessibilityNodeInfo3;
        C3059 c3059;
        C3262 c3264;
        AccessibilityNodeInfo accessibilityNodeInfo4;
        String strM3359;
        Object objM6028;
        EnumC2887 enumC2887;
        Object objM6029;
        Boolean bool;
        C2155 c2157;
        int i6;
        C2542 c2544;
        Object objM60210;
        List list;
        String str;
        Object objM60211;
        String str2;
        Object objM60212;
        C5817 c5819;
        Object objM60213;
        int i7;
        Object objM60214;
        Boolean bool2;
        Object objM60215;
        Integer num;
        int iIntValue2;
        C3059 c30510;
        ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2392;
        boolean z2;
        C3129 c3129M5767;
        Object objM60216;
        Object objM60217;
        C0078 c0078;
        Object objM60218;
        C0078 c0079;
        Object objM60219;
        C0078 c00710;
        String strM4487;
        ArrayList arrayList;
        CharSequence charSequenceM9627;
        C5238 c5238;
        Object objM60220;
        C5548 c5548;
        ArrayList arrayList2;
        Object objM60221;
        boolean zM6867;
        int size2;
        int size3;
        List listM5757;
        int size4;
        int i8;
        C3129 c3129;
        C4323 c4323;
        C4323 c4324;
        int i9;
        CharSequence charSequence;
        boolean zM3362;
        int iM8891;
        Bundle bundle;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0850;
        int iM8892;
        String str3;
        C5817 c58110;
        AbstractC2535 abstractC2535M7039;
        AbstractC2535 abstractC2535M70310;
        C0078 c00711;
        C0078 c00712;
        C0078 c00713;
        C3059 c30511;
        List list2;
        int size5;
        C4523 c4523;
        C1870 c1872;
        int[] iArr;
        int i10;
        int[] iArrCopyOf;
        int i11;
        int i12;
        ArrayList arrayList3;
        int i13;
        Object objM60222;
        Object objM60223;
        Object objM60224;
        boolean zM4486;
        EnumC2459 enumC2459;
        C0605 c0605;
        C5464 c5464;
        C5464 c5465;
        Object objM60225;
        C0078 c00714;
        C3059 c30512;
        C0078 c00715;
        String str4;
        List list3;
        C0605 c0605M1356;
        C2542 c2542M1331;
        boolean zM6874;
        Object objM60226;
        C2542 c2542M1332;
        Object objM60227;
        C0078 c00716;
        Object objM60228;
        C0078 c00717;
        Object objM60229;
        C0078 c00718;
        C0078 c00719;
        ClipDescription primaryClipDescription;
        boolean zHasMimeType;
        Object objM60230;
        boolean z3;
        boolean z4;
        int iM8893;
        C3129 c3129M5768;
        boolean zBooleanValue;
        C2542 c2545;
        C3059 c30513;
        boolean zBooleanValue2;
        Object objM60231;
        InterfaceC2880 density;
        C5460 c5460;
        SpannableString spannableString2;
        List list4;
        ArrayList arrayList4;
        SpannableString spannableString3;
        ?? arrayList5;
        ?? arrayList6;
        int size6;
        int i14;
        int size7;
        int i15;
        List listM2638;
        int size8;
        int i16;
        C2331 c2331;
        int i17;
        Object obj;
        int i18;
        AbstractC4428 abstractC4428;
        WeakHashMap weakHashMap;
        Object c2031;
        C2331 c2332;
        C0780 c0780;
        WeakHashMap weakHashMap2;
        Object uRLSpan;
        C0894 c0894;
        WeakHashMap weakHashMap3;
        Object uRLSpan2;
        int size9;
        int i19;
        C2331 c2333;
        C4433 c4433;
        int i20;
        int i21;
        int size10;
        int i22;
        C2331 c2334;
        int size11;
        int i23;
        int i24;
        int i25;
        long jMo3548;
        C1626 c1626;
        C5827 c5827;
        C5647 c5647;
        long j;
        C1690 c1690;
        InterfaceC5561 interfaceC5561;
        long jMo3549;
        InterfaceC5561 c4268;
        InterfaceC5561 interfaceC5562;
        SpannableString spannableString4;
        C1626 c1627;
        int i26;
        int i27;
        int i28;
        C3129 c31210;
        AbstractC5746 abstractC5746M4510;
        int i29;
        AbstractC2535 abstractC2535;
        C1307 c1307;
        boolean zM6875;
        C3129 c31211;
        int i30;
        int i31;
        String strM7042;
        Object parentForAccessibility;
        View view;
        ViewOnAttachStateChangeListenerC2392 viewOnAttachStateChangeListenerC2393 = this.f2987;
        AccessibilityManager accessibilityManager2 = viewOnAttachStateChangeListenerC2393.f7957;
        ViewTreeObserverOnGlobalLayoutListenerC0850 viewTreeObserverOnGlobalLayoutListenerC0851 = viewOnAttachStateChangeListenerC2393.f7934;
        if (viewTreeObserverOnGlobalLayoutListenerC0851.getComposeViewContext().f18690.mo110().mo2387() == EnumC0458.f1657) {
            if (accessibilityManager2.isEnabled()) {
                c58110 = null;
            } else {
                c58110 = new C5817(AccessibilityNodeInfo.obtain());
            }
            viewOnAttachStateChangeListenerC2392 = viewOnAttachStateChangeListenerC2393;
            i7 = i;
        } else {
            C1307 c1308 = (C1307) viewOnAttachStateChangeListenerC2393.m4510().m9571(i);
            if (c1308 == null) {
                if (accessibilityManager2.isEnabled()) {
                    c58110 = null;
                } else {
                    c58110 = new C5817(AccessibilityNodeInfo.obtain());
                }
                viewOnAttachStateChangeListenerC2392 = viewOnAttachStateChangeListenerC2393;
                i7 = i;
            } else {
                C3129 c31212 = c1308.f4492;
                C2542 c2542M5769 = c31212.m5769();
                C0605 c0606 = c31212.f10471;
                Object objM60232 = c2542M5769.f8490.m6027(AbstractC2771.f9236);
                if (objM60232 == null) {
                    objM60232 = null;
                }
                boolean zM6876 = AbstractC3831.m6874(objM60232, Boolean.TRUE);
                if (!zM6876) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    c5817 = new C5817(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        AbstractC0002.m180(accessibilityNodeInfoObtain, zM6876);
                    } else {
                        c5817.m9628(64, zM6876);
                    }
                    if (i == -1) {
                        parentForAccessibility = viewTreeObserverOnGlobalLayoutListenerC0851.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        c5817.f19153 = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        c3129M5766 = c31212.m5766();
                        if (c3129M5766 != null) {
                            numValueOf = Integer.valueOf(c3129M5766.f10473);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            AbstractC3480.m6277("semanticsNode " + i + " has null parent");
                            C1078.m2274();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == viewTreeObserverOnGlobalLayoutListenerC0851.getSemanticsOwner().m9199().f10473) {
                            iIntValue = -1;
                        }
                        c5817.f19153 = iIntValue;
                        accessibilityNodeInfoObtain.setParent(viewTreeObserverOnGlobalLayoutListenerC0851, iIntValue);
                    }
                    c5817.f19152 = i;
                    accessibilityNodeInfoObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0851, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(viewOnAttachStateChangeListenerC2393.m4491(c1308));
                    c5251 = viewOnAttachStateChangeListenerC2393.f7944;
                    c1870 = viewOnAttachStateChangeListenerC2393.f7953;
                    resources = viewTreeObserverOnGlobalLayoutListenerC0851.getContext().getResources();
                    c5817.m9632("android.view.View");
                    c2542 = c31212.f10476;
                    c3262 = c2542.f8490;
                    if (c3262.m6015(AbstractC2771.f9219)) {
                        c5817.m9632("android.widget.EditText");
                    }
                    if (c3262.m6015(AbstractC2771.f9198)) {
                        c5817.m9632("android.widget.TextView");
                    }
                    objM6027 = c3262.m6027(AbstractC2771.f9196);
                    if (objM6027 == null) {
                        objM6027 = null;
                    }
                    c2155 = (C2155) objM6027;
                    if (c2155 != null) {
                        i30 = c2155.f7116;
                        if (c31212.m5771()) {
                            accessibilityManager = accessibilityManager2;
                            i31 = 4;
                            c1871 = c1870;
                            if (C3129.m5756(4, c31212).isEmpty()) {
                            }
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i31 = 4;
                            c1871 = c1870;
                        }
                        if (i30 == i31) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                        } else if (i30 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                        } else {
                            strM7042 = AbstractC3925.m7042(i30);
                            if (i30 == 5 || c31212.m5772() || c2542.f8487) {
                                c5817.m9632(strM7042);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        c1871 = c1870;
                    }
                    accessibilityNodeInfoObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0851.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(AbstractC2776.m5218(c31212));
                    if (i2 >= 34) {
                        zM179 = AbstractC0002.m179(accessibilityManager);
                    } else {
                        zM179 = true;
                    }
                    listM5756 = C3129.m5756(4, c31212);
                    size = listM5756.size();
                    z = zM179;
                    i3 = 0;
                    i4 = 0;
                    while (i4 < size) {
                        int i32 = size;
                        c31210 = (C3129) listM5756.get(i4);
                        List list5 = listM5756;
                        abstractC5746M4510 = viewOnAttachStateChangeListenerC2393.m4510();
                        int i33 = i4;
                        i29 = c31210.f10473;
                        if (abstractC5746M4510.m9572(i29)) {
                            abstractC2535 = viewTreeObserverOnGlobalLayoutListenerC0851.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(c31210.f10471);
                            if (i29 != -1) {
                                if (abstractC2535 != null) {
                                    accessibilityNodeInfoObtain.addChild(abstractC2535);
                                } else {
                                    c1307 = (C1307) viewOnAttachStateChangeListenerC2393.m4510().m9571(i29);
                                    if (c1307 != null || (c31211 = c1307.f4492) == null) {
                                        zM6875 = false;
                                    } else {
                                        Object objM60233 = c31211.m5769().f8490.m6027(AbstractC2771.f9236);
                                        if (objM60233 == null) {
                                            objM60233 = null;
                                        }
                                        zM6875 = AbstractC3831.m6874(objM60233, Boolean.TRUE);
                                    }
                                    if (z || !zM6875) {
                                        accessibilityNodeInfoObtain.addChild(viewTreeObserverOnGlobalLayoutListenerC0851, i29);
                                    }
                                }
                                c5251.m8888(i29, i3);
                                i3++;
                            }
                        }
                        i4 = i33 + 1;
                        listM5756 = list5;
                        size = i32;
                    }
                    i5 = viewOnAttachStateChangeListenerC2393.f7938;
                    accessibilityNodeInfo = c5817.f19154;
                    if (i == i5) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        c5817.m9630(C5464.f18015);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        c5817.m9630(C5464.f18018);
                    }
                    c1249M3369 = AbstractC1605.m3369(c31212);
                    if (c1249M3369 != null) {
                        viewTreeObserverOnGlobalLayoutListenerC0851.getFontFamilyResolver();
                        density = viewTreeObserverOnGlobalLayoutListenerC0851.getDensity();
                        c5460 = viewOnAttachStateChangeListenerC2393.f7940;
                        String str5 = c1249M3369.f4307;
                        list4 = c1249M3369.f4308;
                        spannableString2 = new SpannableString(str5);
                        arrayList4 = c1249M3369.f4305;
                        if (arrayList4 != null) {
                            size11 = arrayList4.size();
                            i23 = 0;
                            while (i23 < size11) {
                                int i34 = size11;
                                C2331 c2335 = (C2331) arrayList4.get(i23);
                                ArrayList arrayList7 = arrayList4;
                                C0553 c0553 = (C0553) c2335.f7719;
                                int i35 = i23;
                                i24 = c2335.f7718;
                                i25 = c2335.f7717;
                                C2542 c2546 = c2542;
                                C2155 c2158 = c2155;
                                jMo3548 = c0553.f1989.mo3548();
                                AccessibilityNodeInfo accessibilityNodeInfo5 = accessibilityNodeInfoObtain;
                                C5817 c58111 = c5817;
                                long j2 = c0553.f1987;
                                c1626 = c0553.f1984;
                                c5827 = c0553.f1990;
                                c5647 = c0553.f1993;
                                C5668 c5668 = c0553.f1995;
                                AccessibilityNodeInfo accessibilityNodeInfo6 = accessibilityNodeInfo;
                                C3262 c3265 = c3262;
                                j = c0553.f1991;
                                c1690 = c0553.f1992;
                                interfaceC5561 = c0553.f1989;
                                C1249 c1249 = c1249M3369;
                                jMo3549 = interfaceC5561.mo3548();
                                int i36 = C1327.f4593;
                                if (C4462.m7744(jMo3548, jMo3549)) {
                                    interfaceC5562 = interfaceC5561;
                                } else {
                                    if (jMo3548 != 16) {
                                        c4268 = new C4268(jMo3548);
                                    } else {
                                        c4268 = C1752.f5825;
                                    }
                                    interfaceC5562 = c4268;
                                }
                                AbstractC0949.m1949(spannableString2, interfaceC5562.mo3548(), i24, i25);
                                spannableString4 = spannableString2;
                                AbstractC0949.m1945(spannableString4, j2, density, i24, i25);
                                if (c1626 == null || c5827 != null) {
                                    if (c1626 == null) {
                                        c1627 = C1626.f5439;
                                    } else {
                                        c1627 = c1626;
                                    }
                                    if (c5827 != null) {
                                        i26 = c5827.f19197;
                                    } else {
                                        i26 = 0;
                                    }
                                    StyleSpan styleSpan = new StyleSpan(AbstractC1434.m3041(c1627, i26));
                                    i27 = 33;
                                    spannableString4.setSpan(styleSpan, i24, i25, 33);
                                } else {
                                    i27 = 33;
                                }
                                if (c1690 != null) {
                                    i28 = c1690.f5637;
                                    if ((i28 | 1) == i28) {
                                        spannableString4.setSpan(new UnderlineSpan(), i24, i25, i27);
                                    }
                                    if ((i28 | 2) == i28) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i24, i25, i27);
                                    }
                                }
                                if (c5647 != null) {
                                    spannableString4.setSpan(new ScaleXSpan(c5647.f18600), i24, i25, i27);
                                }
                                AbstractC0949.m1950(spannableString4, c5668, i24, i25);
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(AbstractC4225.m7470(j)), i24, i25, i27);
                                }
                                i23 = i35 + 1;
                                spannableString2 = spannableString4;
                                c1249M3369 = c1249;
                                size11 = i34;
                                arrayList4 = arrayList7;
                                c2542 = c2546;
                                c2155 = c2158;
                                c5817 = c58111;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo5;
                                c3262 = c3265;
                                accessibilityNodeInfo = accessibilityNodeInfo6;
                            }
                        }
                        c2543 = c2542;
                        c2156 = c2155;
                        AccessibilityNodeInfo accessibilityNodeInfo7 = accessibilityNodeInfo;
                        c3263 = c3262;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        c5818 = c5817;
                        spannableString3 = spannableString2;
                        C1249 c12410 = c1249M3369;
                        int length = str5.length();
                        arrayList5 = C2340.f7777;
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size10 = list4.size();
                            while (i22 < size10) {
                                Object obj2 = list4.get(i22);
                                c2334 = (C2331) obj2;
                                if (!(c2334.f7719 instanceof C4433) && AbstractC5556.m9310(0, length, c2334.f7718, c2334.f7717)) {
                                    arrayList6.add(obj2);
                                }
                            }
                        } else {
                            arrayList6 = arrayList5;
                        }
                        size6 = arrayList6.size();
                        while (i14 < size6) {
                            C2331 c2336 = (C2331) arrayList6.get(i14);
                            c4433 = (C4433) c2336.f7719;
                            i20 = c2336.f7718;
                            i21 = c2336.f7717;
                            if (c4433 instanceof C4433) {
                                C1078.m2275();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(c4433.f14614).build(), i20, i21, 33);
                        }
                        int length2 = str5.length();
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size9 = list4.size();
                            while (i19 < size9) {
                                Object obj3 = list4.get(i19);
                                c2333 = (C2331) obj3;
                                if (!(c2333.f7719 instanceof C0894) && AbstractC5556.m9310(0, length2, c2333.f7718, c2333.f7717)) {
                                    arrayList5.add(obj3);
                                }
                            }
                        }
                        size7 = arrayList5.size();
                        while (i15 < size7) {
                            C2331 c2337 = (C2331) arrayList5.get(i15);
                            c0894 = (C0894) c2337.f7719;
                            int i37 = c2337.f7718;
                            int i38 = c2337.f7717;
                            weakHashMap3 = (WeakHashMap) c5460.f18001;
                            uRLSpan2 = weakHashMap3.get(c0894);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(c0894.f3238);
                                weakHashMap3.put(c0894, uRLSpan2);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan2, i37, i38, 33);
                        }
                        listM2638 = c12410.m2638(str5.length());
                        size8 = listM2638.size();
                        while (i16 < size8) {
                            c2331 = (C2331) listM2638.get(i16);
                            i17 = c2331.f7718;
                            obj = c2331.f7719;
                            i18 = c2331.f7717;
                            if (i17 != i18) {
                                abstractC4428 = (AbstractC4428) obj;
                                if (abstractC4428 instanceof C0780) {
                                    c0780 = (C0780) obj;
                                    c2332 = new C2331(i17, i18, c0780);
                                    weakHashMap2 = (WeakHashMap) c5460.f17999;
                                    uRLSpan = weakHashMap2.get(c2332);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(c0780.f2822);
                                        weakHashMap2.put(c2332, uRLSpan);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan, i17, i18, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) c5460.f18000;
                                    c2031 = weakHashMap.get(c2331);
                                    if (c2031 == null) {
                                        c2031 = new C2031(abstractC4428);
                                        weakHashMap.put(c2331, c2031);
                                    }
                                    spannableString3.setSpan((ClickableSpan) c2031, i17, i18, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) ViewOnAttachStateChangeListenerC2392.m4485(spannableString3);
                        accessibilityNodeInfo3 = accessibilityNodeInfo7;
                    } else {
                        c5251 = c5251;
                        c2543 = c2542;
                        c2156 = c2155;
                        c3263 = c3262;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        c5818 = c5817;
                        spannableString = null;
                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                    }
                    accessibilityNodeInfo3.setText(spannableString);
                    c3059 = AbstractC2771.f9195;
                    c3264 = c3263;
                    if (c3264.m6015(c3059)) {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo4.setContentInvalid(true);
                        objM60231 = c3264.m6027(c3059);
                        if (objM60231 == null) {
                            objM60231 = null;
                        }
                        accessibilityNodeInfo4.setError((CharSequence) objM60231);
                    } else {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                    }
                    strM3359 = AbstractC1605.m3359(c31212, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        AbstractC5604.m9457(accessibilityNodeInfo3, strM3359);
                    } else {
                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strM3359);
                    }
                    accessibilityNodeInfo4.setCheckable(AbstractC1605.m3358(c31212));
                    objM6028 = c3264.m6027(AbstractC2771.f9222);
                    if (objM6028 == null) {
                        objM6028 = null;
                    }
                    enumC2887 = (EnumC2887) objM6028;
                    if (enumC2887 != null) {
                        if (enumC2887 == EnumC2887.f9632) {
                            accessibilityNodeInfo3.setChecked(true);
                        } else if (enumC2887 == EnumC2887.f9631) {
                            accessibilityNodeInfo3.setChecked(false);
                        }
                    }
                    objM6029 = c3264.m6027(AbstractC2771.f9218);
                    if (objM6029 == null) {
                        objM6029 = null;
                    }
                    bool = (Boolean) objM6029;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (c2156 == null) {
                            c2157 = c2156;
                            i6 = 4;
                        } else {
                            c2157 = c2156;
                            i6 = 4;
                            if (c2157.f7116 == 4) {
                                accessibilityNodeInfo4.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo3.setChecked(zBooleanValue2);
                    } else {
                        c2157 = c2156;
                        i6 = 4;
                    }
                    c2544 = c2543;
                    if (c2544.f8487 || C3129.m5756(i6, c31212).isEmpty()) {
                        objM60210 = c3264.m6027(AbstractC2771.f9213);
                        if (objM60210 == null) {
                            objM60210 = null;
                        }
                        list = (List) objM60210;
                        if (list != null) {
                            str = (String) AbstractC0973.m2058(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo4.setContentDescription(str);
                    }
                    objM60211 = c3264.m6027(AbstractC2771.f9194);
                    if (objM60211 == null) {
                        objM60211 = null;
                    }
                    str2 = (String) objM60211;
                    if (str2 != null) {
                        c3129M5768 = c31212;
                        while (true) {
                            if (c3129M5768 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            c2545 = c3129M5768.f10476;
                            c30513 = AbstractC5685.f18689;
                            if (c2545.f8490.m6015(c30513)) {
                                zBooleanValue = ((Boolean) c2545.m4771(c30513)).booleanValue();
                                break;
                            }
                            c3129M5768 = c3129M5768.m5766();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo4.setViewIdResourceName(str2);
                        }
                    }
                    objM60212 = c3264.m6027(AbstractC2771.f9212);
                    if (objM60212 == null) {
                        objM60212 = null;
                    }
                    if (((C2358) objM60212) == null) {
                        c5819 = c5818;
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo3.setHeading(true);
                        c5819 = c5818;
                    } else {
                        c5819 = c5818;
                        c5819.m9628(2, true);
                    }
                    objM60213 = c3264.m6027(AbstractC2771.f9228);
                    if (objM60213 == null) {
                        objM60213 = null;
                    }
                    if (((C2358) objM60213) != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            accessibilityNodeInfo4.setTextEntryKey(true);
                        } else {
                            c5819.m9628(8, true);
                        }
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iM8893 = c5251.m8891(c31212.f10473);
                        if (iM8893 != -1) {
                            accessibilityNodeInfo4.setDrawingOrder(iM8893);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo4.setPassword(c3264.m6015(AbstractC2771.f9225));
                    objM60214 = c3264.m6027(AbstractC2771.f9235);
                    if (objM60214 == null) {
                        objM60214 = null;
                    }
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfo4.setEditable(AbstractC3831.m6874(objM60214, bool2));
                    objM60215 = c3264.m6027(AbstractC2771.f9206);
                    if (objM60215 == null) {
                        objM60215 = null;
                    }
                    num = (Integer) objM60215;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfo4.setEnabled(AbstractC1605.m3367(c31212));
                    c30510 = AbstractC2771.f9220;
                    accessibilityNodeInfo4.setFocusable(c3264.m6015(c30510));
                    if (accessibilityNodeInfo4.isFocusable()) {
                        accessibilityNodeInfo4.setFocused(((Boolean) c2544.m4771(c30510)).booleanValue());
                        if (accessibilityNodeInfo4.isFocused()) {
                            accessibilityNodeInfo3.addAction(2);
                            viewOnAttachStateChangeListenerC2392 = viewOnAttachStateChangeListenerC2393;
                            viewOnAttachStateChangeListenerC2392.f7929 = i7;
                        } else {
                            viewOnAttachStateChangeListenerC2392 = viewOnAttachStateChangeListenerC2393;
                            z2 = true;
                            accessibilityNodeInfo3.addAction(1);
                        }
                        accessibilityNodeInfo3.setVisibleToUser(AbstractC2776.m5245(c31212) ^ z2);
                        if (c31212.m5771()) {
                            c3129M5767 = c31212.m5766();
                        } else {
                            c3129M5767 = c31212;
                        }
                        if (c3129M5767.m5767().m5318()) {
                            accessibilityNodeInfo3.setVisibleToUser(false);
                        }
                        objM60216 = c3264.m6027(AbstractC2771.f9229);
                        if (objM60216 == null) {
                            objM60216 = null;
                        }
                        if (((C5178) objM60216) != null) {
                            accessibilityNodeInfo4.setLiveRegion(2);
                        }
                        accessibilityNodeInfo3.setClickable(false);
                        objM60217 = c3264.m6027(AbstractC0208.f772);
                        if (objM60217 == null) {
                            objM60217 = null;
                        }
                        c0078 = (C0078) objM60217;
                        if (c0078 != null) {
                            objM60230 = c3264.m6027(AbstractC2771.f9218);
                            if (objM60230 == null) {
                                objM60230 = null;
                            }
                            boolean zM6877 = AbstractC3831.m6874(objM60230, bool2);
                            z3 = (c2157 == null && c2157.f7116 == 4) || (c2157 != null && c2157.f7116 == 3);
                            if (z3 || (z3 && !zM6877)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            accessibilityNodeInfo3.setClickable(z4);
                            if (AbstractC1605.m3367(c31212) && accessibilityNodeInfo4.isClickable()) {
                                c5819.m9630(new C5464(16, c0078.f14721));
                            }
                        }
                        accessibilityNodeInfo3.setLongClickable(false);
                        objM60218 = c3264.m6027(AbstractC0208.f762);
                        if (objM60218 == null) {
                            objM60218 = null;
                        }
                        c0079 = (C0078) objM60218;
                        if (c0079 != null) {
                            accessibilityNodeInfo3.setLongClickable(true);
                            if (AbstractC1605.m3367(c31212)) {
                                c5819.m9630(new C5464(32, c0079.f14721));
                            }
                        }
                        objM60219 = c3264.m6027(AbstractC0208.f767);
                        if (objM60219 == null) {
                            objM60219 = null;
                        }
                        c00710 = (C0078) objM60219;
                        if (c00710 != null) {
                            c5819.m9630(new C5464(16384, c00710.f14721));
                        }
                        if (AbstractC1605.m3367(c31212)) {
                            objM60227 = c3264.m6027(AbstractC0208.f783);
                            if (objM60227 == null) {
                                objM60227 = null;
                            }
                            c00716 = (C0078) objM60227;
                            if (c00716 != null) {
                                c5819.m9630(new C5464(2097152, c00716.f14721));
                            }
                            objM60228 = c3264.m6027(AbstractC0208.f787);
                            if (objM60228 == null) {
                                objM60228 = null;
                            }
                            c00717 = (C0078) objM60228;
                            if (c00717 != null) {
                                c5819.m9630(new C5464(android.R.id.accessibilityActionImeEnter, c00717.f14721));
                            }
                            objM60229 = c3264.m6027(AbstractC0208.f768);
                            if (objM60229 == null) {
                                objM60229 = null;
                            }
                            c00718 = (C0078) objM60229;
                            if (c00718 != null) {
                                c5819.m9630(new C5464(65536, c00718.f14721));
                            }
                            c00719 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f764);
                            if (c00719 != null && accessibilityNodeInfo4.isFocused()) {
                                primaryClipDescription = viewTreeObserverOnGlobalLayoutListenerC0851.getClipboardManager().m1656().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    c5819.m9630(new C5464(32768, c00719.f14721));
                                }
                            }
                        }
                        strM4487 = ViewOnAttachStateChangeListenerC2392.m4487(c31212);
                        if (strM4487 != null && strM4487.length() != 0) {
                            accessibilityNodeInfo4.setTextSelection(viewOnAttachStateChangeListenerC2392.m4502(c31212), viewOnAttachStateChangeListenerC2392.m4501(c31212));
                            c00715 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f779);
                            if (c00715 != null) {
                                str4 = c00715.f14721;
                            } else {
                                str4 = null;
                            }
                            c5819.m9630(new C5464(131072, str4));
                            accessibilityNodeInfo3.addAction(256);
                            accessibilityNodeInfo3.addAction(512);
                            accessibilityNodeInfo3.setMovementGranularities(11);
                            list3 = (List) AbstractC4009.m7178(c2544, AbstractC2771.f9213);
                            if ((list3 != null || list3.isEmpty()) && c3264.m6015(AbstractC0208.f774) && (!c3264.m6015(AbstractC2771.f9219) || AbstractC3831.m6874(AbstractC4009.m7178(c2544, c30510), bool2))) {
                                c0605M1356 = c0606.m1356();
                                while (true) {
                                    if (c0605M1356 == null) {
                                        c0605M1356 = null;
                                        break;
                                    }
                                    c2542M1332 = c0605M1356.m1331();
                                    if (c2542M1332 == null && c2542M1332.f8487) {
                                        if (c2542M1332.f8490.m6015(AbstractC2771.f9219)) {
                                            break;
                                        }
                                    }
                                    c0605M1356 = c0605M1356.m1356();
                                }
                                if (c0605M1356 == null) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                } else {
                                    c2542M1331 = c0605M1356.m1331();
                                    if (c2542M1331 != null) {
                                        objM60226 = c2542M1331.f8490.m6027(c30510);
                                        if (objM60226 == null) {
                                            objM60226 = null;
                                        }
                                        zM6874 = AbstractC3831.m6874(objM60226, bool2);
                                    } else {
                                        zM6874 = false;
                                    }
                                    if (zM6874) {
                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceM9627 = c5819.m9627();
                        if (charSequenceM9627 != null && charSequenceM9627.length() != 0 && c3264.m6015(AbstractC0208.f774)) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (c3264.m6015(AbstractC2771.f9194)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (c3264.m6015(AbstractC2771.f9208)) {
                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        accessibilityNodeInfo4.setAvailableExtraData(arrayList);
                        c5238 = (C5238) AbstractC4009.m7178(c2544, AbstractC2771.f9197);
                        if (c5238 != null) {
                            c30512 = AbstractC0208.f782;
                            if (c3264.m6015(c30512)) {
                                c5819.m9632("android.widget.SeekBar");
                            } else {
                                c5819.m9632("android.widget.ProgressBar");
                            }
                            if (c5238 != C5238.f17294) {
                                accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                            }
                            if (c3264.m6015(c30512)) {
                                AbstractC1605.m3367(c31212);
                            }
                        }
                        if (AbstractC1605.m3367(c31212) && (c00714 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f782)) != null) {
                            c5819.m9630(new C5464(android.R.id.accessibilityActionSetProgress, c00714.f14721));
                        }
                        objM60220 = c31212.m5769().f8490.m6027(AbstractC2771.f9201);
                        if (objM60220 == null) {
                            objM60220 = null;
                        }
                        c5548 = (C5548) objM60220;
                        if (c5548 != null) {
                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(c5548.f18325, c5548.f18324, false, 0));
                        } else {
                            arrayList2 = new ArrayList();
                            objM60221 = c31212.m5769().f8490.m6027(AbstractC2771.f9200);
                            if (objM60221 == null) {
                                objM60221 = null;
                            }
                            if (objM60221 != null) {
                                listM5757 = C3129.m5756(4, c31212);
                                size4 = listM5757.size();
                                while (i8 < size4) {
                                    c3129 = (C3129) listM5757.get(i8);
                                    if (c3129.m5769().f8490.m6015(AbstractC2771.f9218)) {
                                        arrayList2.add(c3129);
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                zM6867 = AbstractC3831.m6867(arrayList2);
                                if (zM6867) {
                                    size2 = 1;
                                } else {
                                    size2 = arrayList2.size();
                                }
                                if (zM6867) {
                                    size3 = arrayList2.size();
                                } else {
                                    size3 = 1;
                                }
                                accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, size3, false, 0));
                            }
                        }
                        AbstractC3831.m6860(c5819, c31212);
                        c4323 = (C4323) AbstractC4009.m7178(c2544, AbstractC2771.f9232);
                        C0078 c00720 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f776);
                        if (c4323 != null && c00720 != null) {
                            objM60224 = c31212.m5769().f8490.m6027(AbstractC2771.f9201);
                            if (objM60224 == null) {
                                objM60224 = null;
                            }
                            if (objM60224 == null) {
                                objM60225 = c31212.m5769().f8490.m6027(AbstractC2771.f9200);
                                if (objM60225 == null) {
                                    objM60225 = null;
                                }
                                if (objM60225 == null) {
                                    c5819.m9632("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) c4323.f14289.mo449()).floatValue() > 0.0f) {
                                accessibilityNodeInfo3.setScrollable(true);
                            }
                            if (AbstractC1605.m3367(c31212)) {
                                zM4486 = ViewOnAttachStateChangeListenerC2392.m4486(c4323);
                                enumC2459 = EnumC2459.f8214;
                                if (zM4486) {
                                    c5819.m9630(C5464.f18016);
                                    c0605 = c0606;
                                    if (c0605.f2272 == enumC2459) {
                                        c5465 = C5464.f18020;
                                    } else {
                                        c5465 = C5464.f18021;
                                    }
                                    c5819.m9630(c5465);
                                } else {
                                    c0605 = c0606;
                                }
                                if (ViewOnAttachStateChangeListenerC2392.m4481(c4323)) {
                                    c5819.m9630(C5464.f18022);
                                    if (c0605.f2272 == enumC2459) {
                                        c5464 = C5464.f18021;
                                    } else {
                                        c5464 = C5464.f18020;
                                    }
                                    c5819.m9630(c5464);
                                }
                            }
                        }
                        c4324 = (C4323) AbstractC4009.m7178(c2544, AbstractC2771.f9209);
                        if (c4324 != null && c00720 != null) {
                            objM60222 = c31212.m5769().f8490.m6027(AbstractC2771.f9201);
                            if (objM60222 == null) {
                                objM60222 = null;
                            }
                            if (objM60222 == null) {
                                objM60223 = c31212.m5769().f8490.m6027(AbstractC2771.f9200);
                                if (objM60223 == null) {
                                    objM60223 = null;
                                }
                                if (objM60223 == null) {
                                    c5819.m9632("android.widget.ScrollView");
                                }
                            }
                            if (((Number) c4324.f14289.mo449()).floatValue() > 0.0f) {
                                accessibilityNodeInfo3.setScrollable(true);
                            }
                            if (AbstractC1605.m3367(c31212)) {
                                if (ViewOnAttachStateChangeListenerC2392.m4486(c4324)) {
                                    c5819.m9630(C5464.f18016);
                                    c5819.m9630(C5464.f18019);
                                }
                                if (ViewOnAttachStateChangeListenerC2392.m4481(c4324)) {
                                    c5819.m9630(C5464.f18022);
                                    c5819.m9630(C5464.f18017);
                                }
                            }
                        }
                        i9 = Build.VERSION.SDK_INT;
                        if (i9 >= 29) {
                            AbstractC5378.m9035(c5819, c31212);
                        }
                        charSequence = (CharSequence) AbstractC4009.m7178(c2544, AbstractC2771.f9216);
                        if (i9 >= 28) {
                            accessibilityNodeInfo3.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (AbstractC1605.m3367(c31212)) {
                            c00711 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f769);
                            if (c00711 != null) {
                                c5819.m9630(new C5464(262144, c00711.f14721));
                            }
                            c00712 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f781);
                            if (c00712 != null) {
                                c5819.m9630(new C5464(524288, c00712.f14721));
                            }
                            c00713 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f786);
                            if (c00713 != null) {
                                c5819.m9630(new C5464(1048576, c00713.f14721));
                            }
                            c30511 = AbstractC0208.f780;
                            if (c3264.m6015(c30511)) {
                                list2 = (List) c2544.m4771(c30511);
                                size5 = list2.size();
                                c4523 = ViewOnAttachStateChangeListenerC2392.f7926;
                                if (size5 < c4523.f14948) {
                                    C1078.m2276(AbstractC3761.m6630(c4523.f14948, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                    return null;
                                }
                                C1870 c1873 = new C1870(0);
                                C1254 c1254M1473 = AbstractC0664.m1473();
                                c1872 = c1871;
                                if (AbstractC2164.m4217(c1872.f6215, i7, c1872.f6217) >= 0) {
                                    iArr = c4523.f14949;
                                    i10 = c4523.f14948;
                                    iArrCopyOf = new int[16];
                                    i11 = 0;
                                    i12 = 0;
                                    while (i11 < i10) {
                                        int i39 = iArr[i11];
                                        int i40 = i10;
                                        i13 = i12 + 1;
                                        int i41 = i11;
                                        if (iArrCopyOf.length < i13) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
                                        }
                                        iArrCopyOf[i12] = i39;
                                        i11 = i41 + 1;
                                        i12 = i13;
                                        i10 = i40;
                                    }
                                    arrayList3 = new ArrayList();
                                    if (list2.size() <= 0) {
                                        AbstractC2049.m4001(list2.get(0));
                                        throw null;
                                    }
                                    if (arrayList3.size() > 0) {
                                        AbstractC2049.m4001(arrayList3.get(0));
                                        if (i12 > 0) {
                                            int i42 = iArrCopyOf[0];
                                            throw null;
                                        }
                                        AbstractC2552.m4812("Index must be between 0 and size");
                                        throw null;
                                    }
                                } else if (list2.size() > 0) {
                                    AbstractC2049.m4001(list2.get(0));
                                    c4523.m7840(0);
                                    throw null;
                                }
                                viewOnAttachStateChangeListenerC2392.f7942.m3722(i7, c1873);
                                c1872.m3722(i7, c1254M1473);
                            }
                        }
                        zM3362 = AbstractC1605.m3362(c31212, resources);
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo3.setScreenReaderFocusable(zM3362);
                        } else {
                            c5819.m9628(1, zM3362);
                        }
                        iM8891 = viewOnAttachStateChangeListenerC2392.f7937.m8891(i7);
                        if (iM8891 != -1) {
                            abstractC2535M70310 = AbstractC3925.m7039(viewTreeObserverOnGlobalLayoutListenerC0851.getAndroidViewsHandler$ui(), iM8891);
                            if (abstractC2535M70310 != null) {
                                accessibilityNodeInfo3.setTraversalBefore(abstractC2535M70310);
                                viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                            } else {
                                viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                                accessibilityNodeInfo3.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC0850, iM8891);
                            }
                            bundle = null;
                            viewOnAttachStateChangeListenerC2392.m4490(i7, c5819, viewOnAttachStateChangeListenerC2392.f7945, null);
                        } else {
                            bundle = null;
                            viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                        }
                        iM8892 = viewOnAttachStateChangeListenerC2392.f7939.m8891(i7);
                        if (iM8892 != -1 && (abstractC2535M7039 = AbstractC3925.m7039(viewTreeObserverOnGlobalLayoutListenerC0850.getAndroidViewsHandler$ui(), iM8892)) != null) {
                            accessibilityNodeInfo3.setTraversalAfter(abstractC2535M7039);
                            viewOnAttachStateChangeListenerC2392.m4490(i7, c5819, viewOnAttachStateChangeListenerC2392.f7950, bundle);
                        }
                        str3 = (String) AbstractC4009.m7178(c2544, AbstractC5685.f18688);
                        if (str3 != null) {
                            c5819.m9632(str3);
                        }
                        c58110 = c5819;
                    } else {
                        viewOnAttachStateChangeListenerC2392 = viewOnAttachStateChangeListenerC2393;
                    }
                    z2 = true;
                    accessibilityNodeInfo3.setVisibleToUser(AbstractC2776.m5245(c31212) ^ z2);
                    if (c31212.m5771()) {
                        c3129M5767 = c31212.m5766();
                    } else {
                        c3129M5767 = c31212;
                    }
                    if (c3129M5767.m5767().m5318()) {
                        accessibilityNodeInfo3.setVisibleToUser(false);
                    }
                    objM60216 = c3264.m6027(AbstractC2771.f9229);
                    if (objM60216 == null) {
                        objM60216 = null;
                    }
                    if (((C5178) objM60216) != null) {
                        accessibilityNodeInfo4.setLiveRegion(2);
                    }
                    accessibilityNodeInfo3.setClickable(false);
                    objM60217 = c3264.m6027(AbstractC0208.f772);
                    if (objM60217 == null) {
                        objM60217 = null;
                    }
                    c0078 = (C0078) objM60217;
                    if (c0078 != null) {
                        objM60230 = c3264.m6027(AbstractC2771.f9218);
                        if (objM60230 == null) {
                            objM60230 = null;
                        }
                        boolean zM6878 = AbstractC3831.m6874(objM60230, bool2);
                        if (c2157 == null) {
                        }
                        if (z3) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        accessibilityNodeInfo3.setClickable(z4);
                        if (AbstractC1605.m3367(c31212)) {
                            c5819.m9630(new C5464(16, c0078.f14721));
                        }
                    }
                    accessibilityNodeInfo3.setLongClickable(false);
                    objM60218 = c3264.m6027(AbstractC0208.f762);
                    if (objM60218 == null) {
                        objM60218 = null;
                    }
                    c0079 = (C0078) objM60218;
                    if (c0079 != null) {
                        accessibilityNodeInfo3.setLongClickable(true);
                        if (AbstractC1605.m3367(c31212)) {
                            c5819.m9630(new C5464(32, c0079.f14721));
                        }
                    }
                    objM60219 = c3264.m6027(AbstractC0208.f767);
                    if (objM60219 == null) {
                        objM60219 = null;
                    }
                    c00710 = (C0078) objM60219;
                    if (c00710 != null) {
                        c5819.m9630(new C5464(16384, c00710.f14721));
                    }
                    if (AbstractC1605.m3367(c31212)) {
                        objM60227 = c3264.m6027(AbstractC0208.f783);
                        if (objM60227 == null) {
                            objM60227 = null;
                        }
                        c00716 = (C0078) objM60227;
                        if (c00716 != null) {
                            c5819.m9630(new C5464(2097152, c00716.f14721));
                        }
                        objM60228 = c3264.m6027(AbstractC0208.f787);
                        if (objM60228 == null) {
                            objM60228 = null;
                        }
                        c00717 = (C0078) objM60228;
                        if (c00717 != null) {
                            c5819.m9630(new C5464(android.R.id.accessibilityActionImeEnter, c00717.f14721));
                        }
                        objM60229 = c3264.m6027(AbstractC0208.f768);
                        if (objM60229 == null) {
                            objM60229 = null;
                        }
                        c00718 = (C0078) objM60229;
                        if (c00718 != null) {
                            c5819.m9630(new C5464(65536, c00718.f14721));
                        }
                        c00719 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f764);
                        if (c00719 != null) {
                            primaryClipDescription = viewTreeObserverOnGlobalLayoutListenerC0851.getClipboardManager().m1656().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                c5819.m9630(new C5464(32768, c00719.f14721));
                            }
                        }
                    }
                    strM4487 = ViewOnAttachStateChangeListenerC2392.m4487(c31212);
                    if (strM4487 != null) {
                        accessibilityNodeInfo4.setTextSelection(viewOnAttachStateChangeListenerC2392.m4502(c31212), viewOnAttachStateChangeListenerC2392.m4501(c31212));
                        c00715 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f779);
                        if (c00715 != null) {
                            str4 = c00715.f14721;
                        } else {
                            str4 = null;
                        }
                        c5819.m9630(new C5464(131072, str4));
                        accessibilityNodeInfo3.addAction(256);
                        accessibilityNodeInfo3.addAction(512);
                        accessibilityNodeInfo3.setMovementGranularities(11);
                        list3 = (List) AbstractC4009.m7178(c2544, AbstractC2771.f9213);
                        if (list3 != null) {
                            c0605M1356 = c0606.m1356();
                            while (true) {
                                if (c0605M1356 == null) {
                                    c0605M1356 = null;
                                    break;
                                }
                                c2542M1332 = c0605M1356.m1331();
                                if (c2542M1332 == null) {
                                }
                                c0605M1356 = c0605M1356.m1356();
                            }
                            if (c0605M1356 == null) {
                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                            } else {
                                c2542M1331 = c0605M1356.m1331();
                                if (c2542M1331 != null) {
                                    objM60226 = c2542M1331.f8490.m6027(c30510);
                                    if (objM60226 == null) {
                                        objM60226 = null;
                                    }
                                    zM6874 = AbstractC3831.m6874(objM60226, bool2);
                                } else {
                                    zM6874 = false;
                                }
                                if (zM6874) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        } else {
                            c0605M1356 = c0606.m1356();
                            while (true) {
                                if (c0605M1356 == null) {
                                    c0605M1356 = null;
                                    break;
                                }
                                c2542M1332 = c0605M1356.m1331();
                                if (c2542M1332 == null) {
                                }
                                c0605M1356 = c0605M1356.m1356();
                            }
                            if (c0605M1356 == null) {
                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                            } else {
                                c2542M1331 = c0605M1356.m1331();
                                if (c2542M1331 != null) {
                                    objM60226 = c2542M1331.f8490.m6027(c30510);
                                    if (objM60226 == null) {
                                        objM60226 = null;
                                    }
                                    zM6874 = AbstractC3831.m6874(objM60226, bool2);
                                } else {
                                    zM6874 = false;
                                }
                                if (zM6874) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceM9627 = c5819.m9627();
                    if (charSequenceM9627 != null) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (c3264.m6015(AbstractC2771.f9194)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (c3264.m6015(AbstractC2771.f9208)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    accessibilityNodeInfo4.setAvailableExtraData(arrayList);
                    c5238 = (C5238) AbstractC4009.m7178(c2544, AbstractC2771.f9197);
                    if (c5238 != null) {
                        c30512 = AbstractC0208.f782;
                        if (c3264.m6015(c30512)) {
                            c5819.m9632("android.widget.SeekBar");
                        } else {
                            c5819.m9632("android.widget.ProgressBar");
                        }
                        if (c5238 != C5238.f17294) {
                            accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                        }
                        if (c3264.m6015(c30512)) {
                            AbstractC1605.m3367(c31212);
                        }
                    }
                    if (AbstractC1605.m3367(c31212)) {
                        c5819.m9630(new C5464(android.R.id.accessibilityActionSetProgress, c00714.f14721));
                    }
                    objM60220 = c31212.m5769().f8490.m6027(AbstractC2771.f9201);
                    if (objM60220 == null) {
                        objM60220 = null;
                    }
                    c5548 = (C5548) objM60220;
                    if (c5548 != null) {
                        accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(c5548.f18325, c5548.f18324, false, 0));
                    } else {
                        arrayList2 = new ArrayList();
                        objM60221 = c31212.m5769().f8490.m6027(AbstractC2771.f9200);
                        if (objM60221 == null) {
                            objM60221 = null;
                        }
                        if (objM60221 != null) {
                            listM5757 = C3129.m5756(4, c31212);
                            size4 = listM5757.size();
                            while (i8 < size4) {
                                c3129 = (C3129) listM5757.get(i8);
                                if (c3129.m5769().f8490.m6015(AbstractC2771.f9218)) {
                                    arrayList2.add(c3129);
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            zM6867 = AbstractC3831.m6867(arrayList2);
                            if (zM6867) {
                                size2 = 1;
                            } else {
                                size2 = arrayList2.size();
                            }
                            if (zM6867) {
                                size3 = arrayList2.size();
                            } else {
                                size3 = 1;
                            }
                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, size3, false, 0));
                        }
                    }
                    AbstractC3831.m6860(c5819, c31212);
                    c4323 = (C4323) AbstractC4009.m7178(c2544, AbstractC2771.f9232);
                    C0078 c00721 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f776);
                    if (c4323 != null) {
                        objM60224 = c31212.m5769().f8490.m6027(AbstractC2771.f9201);
                        if (objM60224 == null) {
                            objM60224 = null;
                        }
                        if (objM60224 == null) {
                            objM60225 = c31212.m5769().f8490.m6027(AbstractC2771.f9200);
                            if (objM60225 == null) {
                                objM60225 = null;
                            }
                            if (objM60225 == null) {
                                c5819.m9632("android.widget.HorizontalScrollView");
                            }
                        }
                        if (((Number) c4323.f14289.mo449()).floatValue() > 0.0f) {
                            accessibilityNodeInfo3.setScrollable(true);
                        }
                        if (AbstractC1605.m3367(c31212)) {
                            zM4486 = ViewOnAttachStateChangeListenerC2392.m4486(c4323);
                            enumC2459 = EnumC2459.f8214;
                            if (zM4486) {
                                c5819.m9630(C5464.f18016);
                                c0605 = c0606;
                                if (c0605.f2272 == enumC2459) {
                                    c5465 = C5464.f18020;
                                } else {
                                    c5465 = C5464.f18021;
                                }
                                c5819.m9630(c5465);
                            } else {
                                c0605 = c0606;
                            }
                            if (ViewOnAttachStateChangeListenerC2392.m4481(c4323)) {
                                c5819.m9630(C5464.f18022);
                                if (c0605.f2272 == enumC2459) {
                                    c5464 = C5464.f18021;
                                } else {
                                    c5464 = C5464.f18020;
                                }
                                c5819.m9630(c5464);
                            }
                        }
                    }
                    c4324 = (C4323) AbstractC4009.m7178(c2544, AbstractC2771.f9209);
                    if (c4324 != null) {
                        objM60222 = c31212.m5769().f8490.m6027(AbstractC2771.f9201);
                        if (objM60222 == null) {
                            objM60222 = null;
                        }
                        if (objM60222 == null) {
                            objM60223 = c31212.m5769().f8490.m6027(AbstractC2771.f9200);
                            if (objM60223 == null) {
                                objM60223 = null;
                            }
                            if (objM60223 == null) {
                                c5819.m9632("android.widget.ScrollView");
                            }
                        }
                        if (((Number) c4324.f14289.mo449()).floatValue() > 0.0f) {
                            accessibilityNodeInfo3.setScrollable(true);
                        }
                        if (AbstractC1605.m3367(c31212)) {
                            if (ViewOnAttachStateChangeListenerC2392.m4486(c4324)) {
                                c5819.m9630(C5464.f18016);
                                c5819.m9630(C5464.f18019);
                            }
                            if (ViewOnAttachStateChangeListenerC2392.m4481(c4324)) {
                                c5819.m9630(C5464.f18022);
                                c5819.m9630(C5464.f18017);
                            }
                        }
                    }
                    i9 = Build.VERSION.SDK_INT;
                    if (i9 >= 29) {
                        AbstractC5378.m9035(c5819, c31212);
                    }
                    charSequence = (CharSequence) AbstractC4009.m7178(c2544, AbstractC2771.f9216);
                    if (i9 >= 28) {
                        accessibilityNodeInfo3.setPaneTitle(charSequence);
                    } else {
                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                    }
                    if (AbstractC1605.m3367(c31212)) {
                        c00711 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f769);
                        if (c00711 != null) {
                            c5819.m9630(new C5464(262144, c00711.f14721));
                        }
                        c00712 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f781);
                        if (c00712 != null) {
                            c5819.m9630(new C5464(524288, c00712.f14721));
                        }
                        c00713 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f786);
                        if (c00713 != null) {
                            c5819.m9630(new C5464(1048576, c00713.f14721));
                        }
                        c30511 = AbstractC0208.f780;
                        if (c3264.m6015(c30511)) {
                            list2 = (List) c2544.m4771(c30511);
                            size5 = list2.size();
                            c4523 = ViewOnAttachStateChangeListenerC2392.f7926;
                            if (size5 < c4523.f14948) {
                                C1078.m2276(AbstractC3761.m6630(c4523.f14948, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                return null;
                            }
                            C1870 c1874 = new C1870(0);
                            C1254 c1254M1474 = AbstractC0664.m1473();
                            c1872 = c1871;
                            if (AbstractC2164.m4217(c1872.f6215, i7, c1872.f6217) >= 0) {
                                iArr = c4523.f14949;
                                i10 = c4523.f14948;
                                iArrCopyOf = new int[16];
                                i11 = 0;
                                i12 = 0;
                                while (i11 < i10) {
                                    int i310 = iArr[i11];
                                    int i43 = i10;
                                    i13 = i12 + 1;
                                    int i44 = i11;
                                    if (iArrCopyOf.length < i13) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
                                    }
                                    iArrCopyOf[i12] = i310;
                                    i11 = i44 + 1;
                                    i12 = i13;
                                    i10 = i43;
                                }
                                arrayList3 = new ArrayList();
                                if (list2.size() <= 0) {
                                    AbstractC2049.m4001(list2.get(0));
                                    throw null;
                                }
                                if (arrayList3.size() > 0) {
                                    AbstractC2049.m4001(arrayList3.get(0));
                                    if (i12 > 0) {
                                        int i45 = iArrCopyOf[0];
                                        throw null;
                                    }
                                    AbstractC2552.m4812("Index must be between 0 and size");
                                    throw null;
                                }
                            } else if (list2.size() > 0) {
                                AbstractC2049.m4001(list2.get(0));
                                c4523.m7840(0);
                                throw null;
                            }
                            viewOnAttachStateChangeListenerC2392.f7942.m3722(i7, c1874);
                            c1872.m3722(i7, c1254M1474);
                        }
                    }
                    zM3362 = AbstractC1605.m3362(c31212, resources);
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo3.setScreenReaderFocusable(zM3362);
                    } else {
                        c5819.m9628(1, zM3362);
                    }
                    iM8891 = viewOnAttachStateChangeListenerC2392.f7937.m8891(i7);
                    if (iM8891 != -1) {
                        abstractC2535M70310 = AbstractC3925.m7039(viewTreeObserverOnGlobalLayoutListenerC0851.getAndroidViewsHandler$ui(), iM8891);
                        if (abstractC2535M70310 != null) {
                            accessibilityNodeInfo3.setTraversalBefore(abstractC2535M70310);
                            viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                            accessibilityNodeInfo3.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC0850, iM8891);
                        }
                        bundle = null;
                        viewOnAttachStateChangeListenerC2392.m4490(i7, c5819, viewOnAttachStateChangeListenerC2392.f7945, null);
                    } else {
                        bundle = null;
                        viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                    }
                    iM8892 = viewOnAttachStateChangeListenerC2392.f7939.m8891(i7);
                    if (iM8892 != -1) {
                        accessibilityNodeInfo3.setTraversalAfter(abstractC2535M7039);
                        viewOnAttachStateChangeListenerC2392.m4490(i7, c5819, viewOnAttachStateChangeListenerC2392.f7950, bundle);
                    }
                    str3 = (String) AbstractC4009.m7178(c2544, AbstractC5685.f18688);
                    if (str3 != null) {
                        c5819.m9632(str3);
                    }
                    c58110 = c5819;
                } else if (Build.VERSION.SDK_INT >= 34 ? AbstractC0002.m179(accessibilityManager2) : true) {
                    accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                    c5817 = new C5817(accessibilityNodeInfoObtain);
                    i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 34) {
                        AbstractC0002.m180(accessibilityNodeInfoObtain, zM6876);
                    } else {
                        c5817.m9628(64, zM6876);
                    }
                    if (i == -1) {
                        parentForAccessibility = viewTreeObserverOnGlobalLayoutListenerC0851.getParentForAccessibility();
                        if (parentForAccessibility instanceof View) {
                            view = (View) parentForAccessibility;
                        } else {
                            view = null;
                        }
                        c5817.f19153 = -1;
                        accessibilityNodeInfoObtain.setParent(view);
                    } else {
                        c3129M5766 = c31212.m5766();
                        if (c3129M5766 != null) {
                            numValueOf = Integer.valueOf(c3129M5766.f10473);
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            AbstractC3480.m6277("semanticsNode " + i + " has null parent");
                            C1078.m2274();
                            return null;
                        }
                        iIntValue = numValueOf.intValue();
                        if (iIntValue == viewTreeObserverOnGlobalLayoutListenerC0851.getSemanticsOwner().m9199().f10473) {
                            iIntValue = -1;
                        }
                        c5817.f19153 = iIntValue;
                        accessibilityNodeInfoObtain.setParent(viewTreeObserverOnGlobalLayoutListenerC0851, iIntValue);
                    }
                    c5817.f19152 = i;
                    accessibilityNodeInfoObtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0851, i);
                    accessibilityNodeInfoObtain.setBoundsInScreen(viewOnAttachStateChangeListenerC2393.m4491(c1308));
                    c5251 = viewOnAttachStateChangeListenerC2393.f7944;
                    c1870 = viewOnAttachStateChangeListenerC2393.f7953;
                    resources = viewTreeObserverOnGlobalLayoutListenerC0851.getContext().getResources();
                    c5817.m9632("android.view.View");
                    c2542 = c31212.f10476;
                    c3262 = c2542.f8490;
                    if (c3262.m6015(AbstractC2771.f9219)) {
                        c5817.m9632("android.widget.EditText");
                    }
                    if (c3262.m6015(AbstractC2771.f9198)) {
                        c5817.m9632("android.widget.TextView");
                    }
                    objM6027 = c3262.m6027(AbstractC2771.f9196);
                    if (objM6027 == null) {
                        objM6027 = null;
                    }
                    c2155 = (C2155) objM6027;
                    if (c2155 != null) {
                        i30 = c2155.f7116;
                        if (c31212.m5771()) {
                            accessibilityManager = accessibilityManager2;
                            i31 = 4;
                            c1871 = c1870;
                        } else {
                            accessibilityManager = accessibilityManager2;
                            i31 = 4;
                            c1871 = c1870;
                            if (C3129.m5756(4, c31212).isEmpty()) {
                            }
                        }
                        if (i30 == i31) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.tab));
                        } else if (i30 == 2) {
                            accessibilityNodeInfoObtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(R.string.switch_role));
                        } else {
                            strM7042 = AbstractC3925.m7042(i30);
                            if (i30 == 5) {
                                c5817.m9632(strM7042);
                            } else {
                                c5817.m9632(strM7042);
                            }
                        }
                    } else {
                        accessibilityManager = accessibilityManager2;
                        c1871 = c1870;
                    }
                    accessibilityNodeInfoObtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0851.getContext().getPackageName());
                    accessibilityNodeInfoObtain.setImportantForAccessibility(AbstractC2776.m5218(c31212));
                    if (i2 >= 34) {
                        zM179 = AbstractC0002.m179(accessibilityManager);
                    } else {
                        zM179 = true;
                    }
                    listM5756 = C3129.m5756(4, c31212);
                    size = listM5756.size();
                    z = zM179;
                    i3 = 0;
                    i4 = 0;
                    while (i4 < size) {
                        int i311 = size;
                        c31210 = (C3129) listM5756.get(i4);
                        List list6 = listM5756;
                        abstractC5746M4510 = viewOnAttachStateChangeListenerC2393.m4510();
                        int i312 = i4;
                        i29 = c31210.f10473;
                        if (abstractC5746M4510.m9572(i29)) {
                            abstractC2535 = viewTreeObserverOnGlobalLayoutListenerC0851.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(c31210.f10471);
                            if (i29 != -1) {
                                if (abstractC2535 != null) {
                                    accessibilityNodeInfoObtain.addChild(abstractC2535);
                                } else {
                                    c1307 = (C1307) viewOnAttachStateChangeListenerC2393.m4510().m9571(i29);
                                    if (c1307 != null) {
                                        zM6875 = false;
                                    } else {
                                        zM6875 = false;
                                    }
                                    if (z) {
                                        accessibilityNodeInfoObtain.addChild(viewTreeObserverOnGlobalLayoutListenerC0851, i29);
                                    } else {
                                        accessibilityNodeInfoObtain.addChild(viewTreeObserverOnGlobalLayoutListenerC0851, i29);
                                    }
                                }
                                c5251.m8888(i29, i3);
                                i3++;
                            }
                        }
                        i4 = i312 + 1;
                        listM5756 = list6;
                        size = i311;
                    }
                    i5 = viewOnAttachStateChangeListenerC2393.f7938;
                    accessibilityNodeInfo = c5817.f19154;
                    if (i == i5) {
                        accessibilityNodeInfo.setAccessibilityFocused(true);
                        c5817.m9630(C5464.f18015);
                    } else {
                        accessibilityNodeInfo.setAccessibilityFocused(false);
                        c5817.m9630(C5464.f18018);
                    }
                    c1249M3369 = AbstractC1605.m3369(c31212);
                    if (c1249M3369 != null) {
                        viewTreeObserverOnGlobalLayoutListenerC0851.getFontFamilyResolver();
                        density = viewTreeObserverOnGlobalLayoutListenerC0851.getDensity();
                        c5460 = viewOnAttachStateChangeListenerC2393.f7940;
                        String str6 = c1249M3369.f4307;
                        list4 = c1249M3369.f4308;
                        spannableString2 = new SpannableString(str6);
                        arrayList4 = c1249M3369.f4305;
                        if (arrayList4 != null) {
                            size11 = arrayList4.size();
                            i23 = 0;
                            while (i23 < size11) {
                                int i313 = size11;
                                C2331 c2338 = (C2331) arrayList4.get(i23);
                                ArrayList arrayList8 = arrayList4;
                                C0553 c0554 = (C0553) c2338.f7719;
                                int i314 = i23;
                                i24 = c2338.f7718;
                                i25 = c2338.f7717;
                                C2542 c2547 = c2542;
                                C2155 c2159 = c2155;
                                jMo3548 = c0554.f1989.mo3548();
                                AccessibilityNodeInfo accessibilityNodeInfo8 = accessibilityNodeInfoObtain;
                                C5817 c58112 = c5817;
                                long j3 = c0554.f1987;
                                c1626 = c0554.f1984;
                                c5827 = c0554.f1990;
                                c5647 = c0554.f1993;
                                C5668 c5669 = c0554.f1995;
                                AccessibilityNodeInfo accessibilityNodeInfo9 = accessibilityNodeInfo;
                                C3262 c3266 = c3262;
                                j = c0554.f1991;
                                c1690 = c0554.f1992;
                                interfaceC5561 = c0554.f1989;
                                C1249 c12411 = c1249M3369;
                                jMo3549 = interfaceC5561.mo3548();
                                int i315 = C1327.f4593;
                                if (C4462.m7744(jMo3548, jMo3549)) {
                                    interfaceC5562 = interfaceC5561;
                                } else {
                                    if (jMo3548 != 16) {
                                        c4268 = new C4268(jMo3548);
                                    } else {
                                        c4268 = C1752.f5825;
                                    }
                                    interfaceC5562 = c4268;
                                }
                                AbstractC0949.m1949(spannableString2, interfaceC5562.mo3548(), i24, i25);
                                spannableString4 = spannableString2;
                                AbstractC0949.m1945(spannableString4, j3, density, i24, i25);
                                if (c1626 == null) {
                                    if (c1626 == null) {
                                        c1627 = C1626.f5439;
                                    } else {
                                        c1627 = c1626;
                                    }
                                    if (c5827 != null) {
                                        i26 = c5827.f19197;
                                    } else {
                                        i26 = 0;
                                    }
                                    StyleSpan styleSpan2 = new StyleSpan(AbstractC1434.m3041(c1627, i26));
                                    i27 = 33;
                                    spannableString4.setSpan(styleSpan2, i24, i25, 33);
                                } else {
                                    if (c1626 == null) {
                                        c1627 = C1626.f5439;
                                    } else {
                                        c1627 = c1626;
                                    }
                                    if (c5827 != null) {
                                        i26 = c5827.f19197;
                                    } else {
                                        i26 = 0;
                                    }
                                    StyleSpan styleSpan3 = new StyleSpan(AbstractC1434.m3041(c1627, i26));
                                    i27 = 33;
                                    spannableString4.setSpan(styleSpan3, i24, i25, 33);
                                }
                                if (c1690 != null) {
                                    i28 = c1690.f5637;
                                    if ((i28 | 1) == i28) {
                                        spannableString4.setSpan(new UnderlineSpan(), i24, i25, i27);
                                    }
                                    if ((i28 | 2) == i28) {
                                        spannableString4.setSpan(new StrikethroughSpan(), i24, i25, i27);
                                    }
                                }
                                if (c5647 != null) {
                                    spannableString4.setSpan(new ScaleXSpan(c5647.f18600), i24, i25, i27);
                                }
                                AbstractC0949.m1950(spannableString4, c5669, i24, i25);
                                if (j != 16) {
                                    spannableString4.setSpan(new BackgroundColorSpan(AbstractC4225.m7470(j)), i24, i25, i27);
                                }
                                i23 = i314 + 1;
                                spannableString2 = spannableString4;
                                c1249M3369 = c12411;
                                size11 = i313;
                                arrayList4 = arrayList8;
                                c2542 = c2547;
                                c2155 = c2159;
                                c5817 = c58112;
                                accessibilityNodeInfoObtain = accessibilityNodeInfo8;
                                c3262 = c3266;
                                accessibilityNodeInfo = accessibilityNodeInfo9;
                            }
                        }
                        c2543 = c2542;
                        c2156 = c2155;
                        AccessibilityNodeInfo accessibilityNodeInfo10 = accessibilityNodeInfo;
                        c3263 = c3262;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        c5818 = c5817;
                        spannableString3 = spannableString2;
                        C1249 c12412 = c1249M3369;
                        int length3 = str6.length();
                        arrayList5 = C2340.f7777;
                        if (list4 != null) {
                            arrayList6 = new ArrayList(list4.size());
                            size10 = list4.size();
                            for (i22 = 0; i22 < size10; i22++) {
                                Object obj4 = list4.get(i22);
                                c2334 = (C2331) obj4;
                                if (!(c2334.f7719 instanceof C4433)) {
                                }
                            }
                        } else {
                            arrayList6 = arrayList5;
                        }
                        size6 = arrayList6.size();
                        for (i14 = 0; i14 < size6; i14++) {
                            C2331 c2339 = (C2331) arrayList6.get(i14);
                            c4433 = (C4433) c2339.f7719;
                            i20 = c2339.f7718;
                            i21 = c2339.f7717;
                            if (c4433 instanceof C4433) {
                                C1078.m2275();
                                return null;
                            }
                            spannableString3.setSpan(new TtsSpan.VerbatimBuilder(c4433.f14614).build(), i20, i21, 33);
                        }
                        int length4 = str6.length();
                        if (list4 != null) {
                            arrayList5 = new ArrayList(list4.size());
                            size9 = list4.size();
                            for (i19 = 0; i19 < size9; i19++) {
                                Object obj5 = list4.get(i19);
                                c2333 = (C2331) obj5;
                                if (!(c2333.f7719 instanceof C0894)) {
                                }
                            }
                        }
                        size7 = arrayList5.size();
                        for (i15 = 0; i15 < size7; i15++) {
                            C2331 c23310 = (C2331) arrayList5.get(i15);
                            c0894 = (C0894) c23310.f7719;
                            int i316 = c23310.f7718;
                            int i317 = c23310.f7717;
                            weakHashMap3 = (WeakHashMap) c5460.f18001;
                            uRLSpan2 = weakHashMap3.get(c0894);
                            if (uRLSpan2 == null) {
                                uRLSpan2 = new URLSpan(c0894.f3238);
                                weakHashMap3.put(c0894, uRLSpan2);
                            }
                            spannableString3.setSpan((URLSpan) uRLSpan2, i316, i317, 33);
                        }
                        listM2638 = c12412.m2638(str6.length());
                        size8 = listM2638.size();
                        for (i16 = 0; i16 < size8; i16++) {
                            c2331 = (C2331) listM2638.get(i16);
                            i17 = c2331.f7718;
                            obj = c2331.f7719;
                            i18 = c2331.f7717;
                            if (i17 != i18) {
                                abstractC4428 = (AbstractC4428) obj;
                                if (abstractC4428 instanceof C0780) {
                                    c0780 = (C0780) obj;
                                    c2332 = new C2331(i17, i18, c0780);
                                    weakHashMap2 = (WeakHashMap) c5460.f17999;
                                    uRLSpan = weakHashMap2.get(c2332);
                                    if (uRLSpan == null) {
                                        uRLSpan = new URLSpan(c0780.f2822);
                                        weakHashMap2.put(c2332, uRLSpan);
                                    }
                                    spannableString3.setSpan((URLSpan) uRLSpan, i17, i18, 33);
                                } else {
                                    weakHashMap = (WeakHashMap) c5460.f18000;
                                    c2031 = weakHashMap.get(c2331);
                                    if (c2031 == null) {
                                        c2031 = new C2031(abstractC4428);
                                        weakHashMap.put(c2331, c2031);
                                    }
                                    spannableString3.setSpan((ClickableSpan) c2031, i17, i18, 33);
                                }
                            }
                        }
                        spannableString = (SpannableString) ViewOnAttachStateChangeListenerC2392.m4485(spannableString3);
                        accessibilityNodeInfo3 = accessibilityNodeInfo10;
                    } else {
                        c5251 = c5251;
                        c2543 = c2542;
                        c2156 = c2155;
                        c3263 = c3262;
                        accessibilityNodeInfo2 = accessibilityNodeInfoObtain;
                        c5818 = c5817;
                        spannableString = null;
                        accessibilityNodeInfo3 = accessibilityNodeInfo;
                    }
                    accessibilityNodeInfo3.setText(spannableString);
                    c3059 = AbstractC2771.f9195;
                    c3264 = c3263;
                    if (c3264.m6015(c3059)) {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                        accessibilityNodeInfo4.setContentInvalid(true);
                        objM60231 = c3264.m6027(c3059);
                        if (objM60231 == null) {
                            objM60231 = null;
                        }
                        accessibilityNodeInfo4.setError((CharSequence) objM60231);
                    } else {
                        accessibilityNodeInfo4 = accessibilityNodeInfo2;
                    }
                    strM3359 = AbstractC1605.m3359(c31212, resources);
                    if (Build.VERSION.SDK_INT >= 30) {
                        AbstractC5604.m9457(accessibilityNodeInfo3, strM3359);
                    } else {
                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", strM3359);
                    }
                    accessibilityNodeInfo4.setCheckable(AbstractC1605.m3358(c31212));
                    objM6028 = c3264.m6027(AbstractC2771.f9222);
                    if (objM6028 == null) {
                        objM6028 = null;
                    }
                    enumC2887 = (EnumC2887) objM6028;
                    if (enumC2887 != null) {
                        if (enumC2887 == EnumC2887.f9632) {
                            accessibilityNodeInfo3.setChecked(true);
                        } else if (enumC2887 == EnumC2887.f9631) {
                            accessibilityNodeInfo3.setChecked(false);
                        }
                    }
                    objM6029 = c3264.m6027(AbstractC2771.f9218);
                    if (objM6029 == null) {
                        objM6029 = null;
                    }
                    bool = (Boolean) objM6029;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                        if (c2156 == null) {
                            c2157 = c2156;
                            i6 = 4;
                        } else {
                            c2157 = c2156;
                            i6 = 4;
                            if (c2157.f7116 == 4) {
                                accessibilityNodeInfo4.setSelected(zBooleanValue2);
                            }
                        }
                        accessibilityNodeInfo3.setChecked(zBooleanValue2);
                    } else {
                        c2157 = c2156;
                        i6 = 4;
                    }
                    c2544 = c2543;
                    if (c2544.f8487) {
                        objM60210 = c3264.m6027(AbstractC2771.f9213);
                        if (objM60210 == null) {
                            objM60210 = null;
                        }
                        list = (List) objM60210;
                        if (list != null) {
                            str = (String) AbstractC0973.m2058(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo4.setContentDescription(str);
                    } else {
                        objM60210 = c3264.m6027(AbstractC2771.f9213);
                        if (objM60210 == null) {
                            objM60210 = null;
                        }
                        list = (List) objM60210;
                        if (list != null) {
                            str = (String) AbstractC0973.m2058(list);
                        } else {
                            str = null;
                        }
                        accessibilityNodeInfo4.setContentDescription(str);
                    }
                    objM60211 = c3264.m6027(AbstractC2771.f9194);
                    if (objM60211 == null) {
                        objM60211 = null;
                    }
                    str2 = (String) objM60211;
                    if (str2 != null) {
                        c3129M5768 = c31212;
                        while (true) {
                            if (c3129M5768 != null) {
                                zBooleanValue = false;
                                break;
                            }
                            c2545 = c3129M5768.f10476;
                            c30513 = AbstractC5685.f18689;
                            if (c2545.f8490.m6015(c30513)) {
                                zBooleanValue = ((Boolean) c2545.m4771(c30513)).booleanValue();
                                break;
                            }
                            c3129M5768 = c3129M5768.m5766();
                        }
                        if (zBooleanValue) {
                            accessibilityNodeInfo4.setViewIdResourceName(str2);
                        }
                    }
                    objM60212 = c3264.m6027(AbstractC2771.f9212);
                    if (objM60212 == null) {
                        objM60212 = null;
                    }
                    if (((C2358) objM60212) == null) {
                        c5819 = c5818;
                    } else if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo3.setHeading(true);
                        c5819 = c5818;
                    } else {
                        c5819 = c5818;
                        c5819.m9628(2, true);
                    }
                    objM60213 = c3264.m6027(AbstractC2771.f9228);
                    if (objM60213 == null) {
                        objM60213 = null;
                    }
                    if (((C2358) objM60213) != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            accessibilityNodeInfo4.setTextEntryKey(true);
                        } else {
                            c5819.m9628(8, true);
                        }
                    }
                    i7 = i;
                    if (i7 != -1) {
                        iM8893 = c5251.m8891(c31212.f10473);
                        if (iM8893 != -1) {
                            accessibilityNodeInfo4.setDrawingOrder(iM8893);
                        } else {
                            Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                        }
                    }
                    accessibilityNodeInfo4.setPassword(c3264.m6015(AbstractC2771.f9225));
                    objM60214 = c3264.m6027(AbstractC2771.f9235);
                    if (objM60214 == null) {
                        objM60214 = null;
                    }
                    bool2 = Boolean.TRUE;
                    accessibilityNodeInfo4.setEditable(AbstractC3831.m6874(objM60214, bool2));
                    objM60215 = c3264.m6027(AbstractC2771.f9206);
                    if (objM60215 == null) {
                        objM60215 = null;
                    }
                    num = (Integer) objM60215;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = -1;
                    }
                    accessibilityNodeInfo4.setMaxTextLength(iIntValue2);
                    accessibilityNodeInfo4.setEnabled(AbstractC1605.m3367(c31212));
                    c30510 = AbstractC2771.f9220;
                    accessibilityNodeInfo4.setFocusable(c3264.m6015(c30510));
                    if (accessibilityNodeInfo4.isFocusable()) {
                        accessibilityNodeInfo4.setFocused(((Boolean) c2544.m4771(c30510)).booleanValue());
                        if (accessibilityNodeInfo4.isFocused()) {
                            accessibilityNodeInfo3.addAction(2);
                            viewOnAttachStateChangeListenerC2392 = viewOnAttachStateChangeListenerC2393;
                            viewOnAttachStateChangeListenerC2392.f7929 = i7;
                        } else {
                            viewOnAttachStateChangeListenerC2392 = viewOnAttachStateChangeListenerC2393;
                            z2 = true;
                            accessibilityNodeInfo3.addAction(1);
                        }
                        accessibilityNodeInfo3.setVisibleToUser(AbstractC2776.m5245(c31212) ^ z2);
                        if (c31212.m5771()) {
                            c3129M5767 = c31212.m5766();
                        } else {
                            c3129M5767 = c31212;
                        }
                        if (c3129M5767.m5767().m5318()) {
                            accessibilityNodeInfo3.setVisibleToUser(false);
                        }
                        objM60216 = c3264.m6027(AbstractC2771.f9229);
                        if (objM60216 == null) {
                            objM60216 = null;
                        }
                        if (((C5178) objM60216) != null) {
                            accessibilityNodeInfo4.setLiveRegion(2);
                        }
                        accessibilityNodeInfo3.setClickable(false);
                        objM60217 = c3264.m6027(AbstractC0208.f772);
                        if (objM60217 == null) {
                            objM60217 = null;
                        }
                        c0078 = (C0078) objM60217;
                        if (c0078 != null) {
                            objM60230 = c3264.m6027(AbstractC2771.f9218);
                            if (objM60230 == null) {
                                objM60230 = null;
                            }
                            boolean zM6879 = AbstractC3831.m6874(objM60230, bool2);
                            if (c2157 == null) {
                            }
                            if (z3) {
                                z4 = true;
                            } else {
                                z4 = true;
                            }
                            accessibilityNodeInfo3.setClickable(z4);
                            if (AbstractC1605.m3367(c31212)) {
                                c5819.m9630(new C5464(16, c0078.f14721));
                            }
                        }
                        accessibilityNodeInfo3.setLongClickable(false);
                        objM60218 = c3264.m6027(AbstractC0208.f762);
                        if (objM60218 == null) {
                            objM60218 = null;
                        }
                        c0079 = (C0078) objM60218;
                        if (c0079 != null) {
                            accessibilityNodeInfo3.setLongClickable(true);
                            if (AbstractC1605.m3367(c31212)) {
                                c5819.m9630(new C5464(32, c0079.f14721));
                            }
                        }
                        objM60219 = c3264.m6027(AbstractC0208.f767);
                        if (objM60219 == null) {
                            objM60219 = null;
                        }
                        c00710 = (C0078) objM60219;
                        if (c00710 != null) {
                            c5819.m9630(new C5464(16384, c00710.f14721));
                        }
                        if (AbstractC1605.m3367(c31212)) {
                            objM60227 = c3264.m6027(AbstractC0208.f783);
                            if (objM60227 == null) {
                                objM60227 = null;
                            }
                            c00716 = (C0078) objM60227;
                            if (c00716 != null) {
                                c5819.m9630(new C5464(2097152, c00716.f14721));
                            }
                            objM60228 = c3264.m6027(AbstractC0208.f787);
                            if (objM60228 == null) {
                                objM60228 = null;
                            }
                            c00717 = (C0078) objM60228;
                            if (c00717 != null) {
                                c5819.m9630(new C5464(android.R.id.accessibilityActionImeEnter, c00717.f14721));
                            }
                            objM60229 = c3264.m6027(AbstractC0208.f768);
                            if (objM60229 == null) {
                                objM60229 = null;
                            }
                            c00718 = (C0078) objM60229;
                            if (c00718 != null) {
                                c5819.m9630(new C5464(65536, c00718.f14721));
                            }
                            c00719 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f764);
                            if (c00719 != null) {
                                primaryClipDescription = viewTreeObserverOnGlobalLayoutListenerC0851.getClipboardManager().m1656().getPrimaryClipDescription();
                                if (primaryClipDescription != null) {
                                    zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                                } else {
                                    zHasMimeType = false;
                                }
                                if (zHasMimeType) {
                                    c5819.m9630(new C5464(32768, c00719.f14721));
                                }
                            }
                        }
                        strM4487 = ViewOnAttachStateChangeListenerC2392.m4487(c31212);
                        if (strM4487 != null) {
                            accessibilityNodeInfo4.setTextSelection(viewOnAttachStateChangeListenerC2392.m4502(c31212), viewOnAttachStateChangeListenerC2392.m4501(c31212));
                            c00715 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f779);
                            if (c00715 != null) {
                                str4 = c00715.f14721;
                            } else {
                                str4 = null;
                            }
                            c5819.m9630(new C5464(131072, str4));
                            accessibilityNodeInfo3.addAction(256);
                            accessibilityNodeInfo3.addAction(512);
                            accessibilityNodeInfo3.setMovementGranularities(11);
                            list3 = (List) AbstractC4009.m7178(c2544, AbstractC2771.f9213);
                            if (list3 != null) {
                                c0605M1356 = c0606.m1356();
                                while (true) {
                                    if (c0605M1356 == null) {
                                        c0605M1356 = null;
                                        break;
                                    }
                                    c2542M1332 = c0605M1356.m1331();
                                    if (c2542M1332 == null) {
                                    }
                                    c0605M1356 = c0605M1356.m1356();
                                }
                                if (c0605M1356 == null) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                } else {
                                    c2542M1331 = c0605M1356.m1331();
                                    if (c2542M1331 != null) {
                                        objM60226 = c2542M1331.f8490.m6027(c30510);
                                        if (objM60226 == null) {
                                            objM60226 = null;
                                        }
                                        zM6874 = AbstractC3831.m6874(objM60226, bool2);
                                    } else {
                                        zM6874 = false;
                                    }
                                    if (zM6874) {
                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    }
                                }
                            } else {
                                c0605M1356 = c0606.m1356();
                                while (true) {
                                    if (c0605M1356 == null) {
                                        c0605M1356 = null;
                                        break;
                                    }
                                    c2542M1332 = c0605M1356.m1331();
                                    if (c2542M1332 == null) {
                                    }
                                    c0605M1356 = c0605M1356.m1356();
                                }
                                if (c0605M1356 == null) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                } else {
                                    c2542M1331 = c0605M1356.m1331();
                                    if (c2542M1331 != null) {
                                        objM60226 = c2542M1331.f8490.m6027(c30510);
                                        if (objM60226 == null) {
                                            objM60226 = null;
                                        }
                                        zM6874 = AbstractC3831.m6874(objM60226, bool2);
                                    } else {
                                        zM6874 = false;
                                    }
                                    if (zM6874) {
                                        accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                    }
                                }
                            }
                        }
                        arrayList = new ArrayList();
                        arrayList.add("androidx.compose.ui.semantics.id");
                        charSequenceM9627 = c5819.m9627();
                        if (charSequenceM9627 != null) {
                            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                        }
                        if (c3264.m6015(AbstractC2771.f9194)) {
                            arrayList.add("androidx.compose.ui.semantics.testTag");
                        }
                        if (c3264.m6015(AbstractC2771.f9208)) {
                            arrayList.add("androidx.compose.ui.semantics.shapeType");
                            arrayList.add("androidx.compose.ui.semantics.shapeRect");
                            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                        }
                        accessibilityNodeInfo4.setAvailableExtraData(arrayList);
                        c5238 = (C5238) AbstractC4009.m7178(c2544, AbstractC2771.f9197);
                        if (c5238 != null) {
                            c30512 = AbstractC0208.f782;
                            if (c3264.m6015(c30512)) {
                                c5819.m9632("android.widget.SeekBar");
                            } else {
                                c5819.m9632("android.widget.ProgressBar");
                            }
                            if (c5238 != C5238.f17294) {
                                accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                            }
                            if (c3264.m6015(c30512)) {
                                AbstractC1605.m3367(c31212);
                            }
                        }
                        if (AbstractC1605.m3367(c31212)) {
                            c5819.m9630(new C5464(android.R.id.accessibilityActionSetProgress, c00714.f14721));
                        }
                        objM60220 = c31212.m5769().f8490.m6027(AbstractC2771.f9201);
                        if (objM60220 == null) {
                            objM60220 = null;
                        }
                        c5548 = (C5548) objM60220;
                        if (c5548 != null) {
                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(c5548.f18325, c5548.f18324, false, 0));
                        } else {
                            arrayList2 = new ArrayList();
                            objM60221 = c31212.m5769().f8490.m6027(AbstractC2771.f9200);
                            if (objM60221 == null) {
                                objM60221 = null;
                            }
                            if (objM60221 != null) {
                                listM5757 = C3129.m5756(4, c31212);
                                size4 = listM5757.size();
                                for (i8 = 0; i8 < size4; i8++) {
                                    c3129 = (C3129) listM5757.get(i8);
                                    if (c3129.m5769().f8490.m6015(AbstractC2771.f9218)) {
                                        arrayList2.add(c3129);
                                    }
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                zM6867 = AbstractC3831.m6867(arrayList2);
                                if (zM6867) {
                                    size2 = 1;
                                } else {
                                    size2 = arrayList2.size();
                                }
                                if (zM6867) {
                                    size3 = arrayList2.size();
                                } else {
                                    size3 = 1;
                                }
                                accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, size3, false, 0));
                            }
                        }
                        AbstractC3831.m6860(c5819, c31212);
                        c4323 = (C4323) AbstractC4009.m7178(c2544, AbstractC2771.f9232);
                        C0078 c00722 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f776);
                        if (c4323 != null) {
                            objM60224 = c31212.m5769().f8490.m6027(AbstractC2771.f9201);
                            if (objM60224 == null) {
                                objM60224 = null;
                            }
                            if (objM60224 == null) {
                                objM60225 = c31212.m5769().f8490.m6027(AbstractC2771.f9200);
                                if (objM60225 == null) {
                                    objM60225 = null;
                                }
                                if (objM60225 == null) {
                                    c5819.m9632("android.widget.HorizontalScrollView");
                                }
                            }
                            if (((Number) c4323.f14289.mo449()).floatValue() > 0.0f) {
                                accessibilityNodeInfo3.setScrollable(true);
                            }
                            if (AbstractC1605.m3367(c31212)) {
                                zM4486 = ViewOnAttachStateChangeListenerC2392.m4486(c4323);
                                enumC2459 = EnumC2459.f8214;
                                if (zM4486) {
                                    c5819.m9630(C5464.f18016);
                                    c0605 = c0606;
                                    if (c0605.f2272 == enumC2459) {
                                        c5465 = C5464.f18020;
                                    } else {
                                        c5465 = C5464.f18021;
                                    }
                                    c5819.m9630(c5465);
                                } else {
                                    c0605 = c0606;
                                }
                                if (ViewOnAttachStateChangeListenerC2392.m4481(c4323)) {
                                    c5819.m9630(C5464.f18022);
                                    if (c0605.f2272 == enumC2459) {
                                        c5464 = C5464.f18021;
                                    } else {
                                        c5464 = C5464.f18020;
                                    }
                                    c5819.m9630(c5464);
                                }
                            }
                        }
                        c4324 = (C4323) AbstractC4009.m7178(c2544, AbstractC2771.f9209);
                        if (c4324 != null) {
                            objM60222 = c31212.m5769().f8490.m6027(AbstractC2771.f9201);
                            if (objM60222 == null) {
                                objM60222 = null;
                            }
                            if (objM60222 == null) {
                                objM60223 = c31212.m5769().f8490.m6027(AbstractC2771.f9200);
                                if (objM60223 == null) {
                                    objM60223 = null;
                                }
                                if (objM60223 == null) {
                                    c5819.m9632("android.widget.ScrollView");
                                }
                            }
                            if (((Number) c4324.f14289.mo449()).floatValue() > 0.0f) {
                                accessibilityNodeInfo3.setScrollable(true);
                            }
                            if (AbstractC1605.m3367(c31212)) {
                                if (ViewOnAttachStateChangeListenerC2392.m4486(c4324)) {
                                    c5819.m9630(C5464.f18016);
                                    c5819.m9630(C5464.f18019);
                                }
                                if (ViewOnAttachStateChangeListenerC2392.m4481(c4324)) {
                                    c5819.m9630(C5464.f18022);
                                    c5819.m9630(C5464.f18017);
                                }
                            }
                        }
                        i9 = Build.VERSION.SDK_INT;
                        if (i9 >= 29) {
                            AbstractC5378.m9035(c5819, c31212);
                        }
                        charSequence = (CharSequence) AbstractC4009.m7178(c2544, AbstractC2771.f9216);
                        if (i9 >= 28) {
                            accessibilityNodeInfo3.setPaneTitle(charSequence);
                        } else {
                            accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                        }
                        if (AbstractC1605.m3367(c31212)) {
                            c00711 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f769);
                            if (c00711 != null) {
                                c5819.m9630(new C5464(262144, c00711.f14721));
                            }
                            c00712 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f781);
                            if (c00712 != null) {
                                c5819.m9630(new C5464(524288, c00712.f14721));
                            }
                            c00713 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f786);
                            if (c00713 != null) {
                                c5819.m9630(new C5464(1048576, c00713.f14721));
                            }
                            c30511 = AbstractC0208.f780;
                            if (c3264.m6015(c30511)) {
                                list2 = (List) c2544.m4771(c30511);
                                size5 = list2.size();
                                c4523 = ViewOnAttachStateChangeListenerC2392.f7926;
                                if (size5 < c4523.f14948) {
                                    C1078.m2276(AbstractC3761.m6630(c4523.f14948, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                    return null;
                                }
                                C1870 c1875 = new C1870(0);
                                C1254 c1254M1475 = AbstractC0664.m1473();
                                c1872 = c1871;
                                if (AbstractC2164.m4217(c1872.f6215, i7, c1872.f6217) >= 0) {
                                    iArr = c4523.f14949;
                                    i10 = c4523.f14948;
                                    iArrCopyOf = new int[16];
                                    i11 = 0;
                                    i12 = 0;
                                    while (i11 < i10) {
                                        int i318 = iArr[i11];
                                        int i46 = i10;
                                        i13 = i12 + 1;
                                        int i47 = i11;
                                        if (iArrCopyOf.length < i13) {
                                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
                                        }
                                        iArrCopyOf[i12] = i318;
                                        i11 = i47 + 1;
                                        i12 = i13;
                                        i10 = i46;
                                    }
                                    arrayList3 = new ArrayList();
                                    if (list2.size() <= 0) {
                                        AbstractC2049.m4001(list2.get(0));
                                        throw null;
                                    }
                                    if (arrayList3.size() > 0) {
                                        AbstractC2049.m4001(arrayList3.get(0));
                                        if (i12 > 0) {
                                            int i48 = iArrCopyOf[0];
                                            throw null;
                                        }
                                        AbstractC2552.m4812("Index must be between 0 and size");
                                        throw null;
                                    }
                                } else if (list2.size() > 0) {
                                    AbstractC2049.m4001(list2.get(0));
                                    c4523.m7840(0);
                                    throw null;
                                }
                                viewOnAttachStateChangeListenerC2392.f7942.m3722(i7, c1875);
                                c1872.m3722(i7, c1254M1475);
                            }
                        }
                        zM3362 = AbstractC1605.m3362(c31212, resources);
                        if (Build.VERSION.SDK_INT >= 28) {
                            accessibilityNodeInfo3.setScreenReaderFocusable(zM3362);
                        } else {
                            c5819.m9628(1, zM3362);
                        }
                        iM8891 = viewOnAttachStateChangeListenerC2392.f7937.m8891(i7);
                        if (iM8891 != -1) {
                            abstractC2535M70310 = AbstractC3925.m7039(viewTreeObserverOnGlobalLayoutListenerC0851.getAndroidViewsHandler$ui(), iM8891);
                            if (abstractC2535M70310 != null) {
                                accessibilityNodeInfo3.setTraversalBefore(abstractC2535M70310);
                                viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                            } else {
                                viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                                accessibilityNodeInfo3.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC0850, iM8891);
                            }
                            bundle = null;
                            viewOnAttachStateChangeListenerC2392.m4490(i7, c5819, viewOnAttachStateChangeListenerC2392.f7945, null);
                        } else {
                            bundle = null;
                            viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                        }
                        iM8892 = viewOnAttachStateChangeListenerC2392.f7939.m8891(i7);
                        if (iM8892 != -1) {
                            accessibilityNodeInfo3.setTraversalAfter(abstractC2535M7039);
                            viewOnAttachStateChangeListenerC2392.m4490(i7, c5819, viewOnAttachStateChangeListenerC2392.f7950, bundle);
                        }
                        str3 = (String) AbstractC4009.m7178(c2544, AbstractC5685.f18688);
                        if (str3 != null) {
                            c5819.m9632(str3);
                        }
                        c58110 = c5819;
                    } else {
                        viewOnAttachStateChangeListenerC2392 = viewOnAttachStateChangeListenerC2393;
                    }
                    z2 = true;
                    accessibilityNodeInfo3.setVisibleToUser(AbstractC2776.m5245(c31212) ^ z2);
                    if (c31212.m5771()) {
                        c3129M5767 = c31212.m5766();
                    } else {
                        c3129M5767 = c31212;
                    }
                    if (c3129M5767.m5767().m5318()) {
                        accessibilityNodeInfo3.setVisibleToUser(false);
                    }
                    objM60216 = c3264.m6027(AbstractC2771.f9229);
                    if (objM60216 == null) {
                        objM60216 = null;
                    }
                    if (((C5178) objM60216) != null) {
                        accessibilityNodeInfo4.setLiveRegion(2);
                    }
                    accessibilityNodeInfo3.setClickable(false);
                    objM60217 = c3264.m6027(AbstractC0208.f772);
                    if (objM60217 == null) {
                        objM60217 = null;
                    }
                    c0078 = (C0078) objM60217;
                    if (c0078 != null) {
                        objM60230 = c3264.m6027(AbstractC2771.f9218);
                        if (objM60230 == null) {
                            objM60230 = null;
                        }
                        boolean zM68710 = AbstractC3831.m6874(objM60230, bool2);
                        if (c2157 == null) {
                        }
                        if (z3) {
                            z4 = true;
                        } else {
                            z4 = true;
                        }
                        accessibilityNodeInfo3.setClickable(z4);
                        if (AbstractC1605.m3367(c31212)) {
                            c5819.m9630(new C5464(16, c0078.f14721));
                        }
                    }
                    accessibilityNodeInfo3.setLongClickable(false);
                    objM60218 = c3264.m6027(AbstractC0208.f762);
                    if (objM60218 == null) {
                        objM60218 = null;
                    }
                    c0079 = (C0078) objM60218;
                    if (c0079 != null) {
                        accessibilityNodeInfo3.setLongClickable(true);
                        if (AbstractC1605.m3367(c31212)) {
                            c5819.m9630(new C5464(32, c0079.f14721));
                        }
                    }
                    objM60219 = c3264.m6027(AbstractC0208.f767);
                    if (objM60219 == null) {
                        objM60219 = null;
                    }
                    c00710 = (C0078) objM60219;
                    if (c00710 != null) {
                        c5819.m9630(new C5464(16384, c00710.f14721));
                    }
                    if (AbstractC1605.m3367(c31212)) {
                        objM60227 = c3264.m6027(AbstractC0208.f783);
                        if (objM60227 == null) {
                            objM60227 = null;
                        }
                        c00716 = (C0078) objM60227;
                        if (c00716 != null) {
                            c5819.m9630(new C5464(2097152, c00716.f14721));
                        }
                        objM60228 = c3264.m6027(AbstractC0208.f787);
                        if (objM60228 == null) {
                            objM60228 = null;
                        }
                        c00717 = (C0078) objM60228;
                        if (c00717 != null) {
                            c5819.m9630(new C5464(android.R.id.accessibilityActionImeEnter, c00717.f14721));
                        }
                        objM60229 = c3264.m6027(AbstractC0208.f768);
                        if (objM60229 == null) {
                            objM60229 = null;
                        }
                        c00718 = (C0078) objM60229;
                        if (c00718 != null) {
                            c5819.m9630(new C5464(65536, c00718.f14721));
                        }
                        c00719 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f764);
                        if (c00719 != null) {
                            primaryClipDescription = viewTreeObserverOnGlobalLayoutListenerC0851.getClipboardManager().m1656().getPrimaryClipDescription();
                            if (primaryClipDescription != null) {
                                zHasMimeType = primaryClipDescription.hasMimeType("text/*");
                            } else {
                                zHasMimeType = false;
                            }
                            if (zHasMimeType) {
                                c5819.m9630(new C5464(32768, c00719.f14721));
                            }
                        }
                    }
                    strM4487 = ViewOnAttachStateChangeListenerC2392.m4487(c31212);
                    if (strM4487 != null) {
                        accessibilityNodeInfo4.setTextSelection(viewOnAttachStateChangeListenerC2392.m4502(c31212), viewOnAttachStateChangeListenerC2392.m4501(c31212));
                        c00715 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f779);
                        if (c00715 != null) {
                            str4 = c00715.f14721;
                        } else {
                            str4 = null;
                        }
                        c5819.m9630(new C5464(131072, str4));
                        accessibilityNodeInfo3.addAction(256);
                        accessibilityNodeInfo3.addAction(512);
                        accessibilityNodeInfo3.setMovementGranularities(11);
                        list3 = (List) AbstractC4009.m7178(c2544, AbstractC2771.f9213);
                        if (list3 != null) {
                            c0605M1356 = c0606.m1356();
                            while (true) {
                                if (c0605M1356 == null) {
                                    c0605M1356 = null;
                                    break;
                                }
                                c2542M1332 = c0605M1356.m1331();
                                if (c2542M1332 == null) {
                                }
                                c0605M1356 = c0605M1356.m1356();
                            }
                            if (c0605M1356 == null) {
                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                            } else {
                                c2542M1331 = c0605M1356.m1331();
                                if (c2542M1331 != null) {
                                    objM60226 = c2542M1331.f8490.m6027(c30510);
                                    if (objM60226 == null) {
                                        objM60226 = null;
                                    }
                                    zM6874 = AbstractC3831.m6874(objM60226, bool2);
                                } else {
                                    zM6874 = false;
                                }
                                if (zM6874) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        } else {
                            c0605M1356 = c0606.m1356();
                            while (true) {
                                if (c0605M1356 == null) {
                                    c0605M1356 = null;
                                    break;
                                }
                                c2542M1332 = c0605M1356.m1331();
                                if (c2542M1332 == null) {
                                }
                                c0605M1356 = c0605M1356.m1356();
                            }
                            if (c0605M1356 == null) {
                                accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                            } else {
                                c2542M1331 = c0605M1356.m1331();
                                if (c2542M1331 != null) {
                                    objM60226 = c2542M1331.f8490.m6027(c30510);
                                    if (objM60226 == null) {
                                        objM60226 = null;
                                    }
                                    zM6874 = AbstractC3831.m6874(objM60226, bool2);
                                } else {
                                    zM6874 = false;
                                }
                                if (zM6874) {
                                    accessibilityNodeInfo3.setMovementGranularities(accessibilityNodeInfo4.getMovementGranularities() | 20);
                                }
                            }
                        }
                    }
                    arrayList = new ArrayList();
                    arrayList.add("androidx.compose.ui.semantics.id");
                    charSequenceM9627 = c5819.m9627();
                    if (charSequenceM9627 != null) {
                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                    }
                    if (c3264.m6015(AbstractC2771.f9194)) {
                        arrayList.add("androidx.compose.ui.semantics.testTag");
                    }
                    if (c3264.m6015(AbstractC2771.f9208)) {
                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                    }
                    accessibilityNodeInfo4.setAvailableExtraData(arrayList);
                    c5238 = (C5238) AbstractC4009.m7178(c2544, AbstractC2771.f9197);
                    if (c5238 != null) {
                        c30512 = AbstractC0208.f782;
                        if (c3264.m6015(c30512)) {
                            c5819.m9632("android.widget.SeekBar");
                        } else {
                            c5819.m9632("android.widget.ProgressBar");
                        }
                        if (c5238 != C5238.f17294) {
                            accessibilityNodeInfo4.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                        }
                        if (c3264.m6015(c30512)) {
                            AbstractC1605.m3367(c31212);
                        }
                    }
                    if (AbstractC1605.m3367(c31212)) {
                        c5819.m9630(new C5464(android.R.id.accessibilityActionSetProgress, c00714.f14721));
                    }
                    objM60220 = c31212.m5769().f8490.m6027(AbstractC2771.f9201);
                    if (objM60220 == null) {
                        objM60220 = null;
                    }
                    c5548 = (C5548) objM60220;
                    if (c5548 != null) {
                        accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(c5548.f18325, c5548.f18324, false, 0));
                    } else {
                        arrayList2 = new ArrayList();
                        objM60221 = c31212.m5769().f8490.m6027(AbstractC2771.f9200);
                        if (objM60221 == null) {
                            objM60221 = null;
                        }
                        if (objM60221 != null) {
                            listM5757 = C3129.m5756(4, c31212);
                            size4 = listM5757.size();
                            while (i8 < size4) {
                                c3129 = (C3129) listM5757.get(i8);
                                if (c3129.m5769().f8490.m6015(AbstractC2771.f9218)) {
                                    arrayList2.add(c3129);
                                }
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            zM6867 = AbstractC3831.m6867(arrayList2);
                            if (zM6867) {
                                size2 = 1;
                            } else {
                                size2 = arrayList2.size();
                            }
                            if (zM6867) {
                                size3 = arrayList2.size();
                            } else {
                                size3 = 1;
                            }
                            accessibilityNodeInfo3.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(size2, size3, false, 0));
                        }
                    }
                    AbstractC3831.m6860(c5819, c31212);
                    c4323 = (C4323) AbstractC4009.m7178(c2544, AbstractC2771.f9232);
                    C0078 c00723 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f776);
                    if (c4323 != null) {
                        objM60224 = c31212.m5769().f8490.m6027(AbstractC2771.f9201);
                        if (objM60224 == null) {
                            objM60224 = null;
                        }
                        if (objM60224 == null) {
                            objM60225 = c31212.m5769().f8490.m6027(AbstractC2771.f9200);
                            if (objM60225 == null) {
                                objM60225 = null;
                            }
                            if (objM60225 == null) {
                                c5819.m9632("android.widget.HorizontalScrollView");
                            }
                        }
                        if (((Number) c4323.f14289.mo449()).floatValue() > 0.0f) {
                            accessibilityNodeInfo3.setScrollable(true);
                        }
                        if (AbstractC1605.m3367(c31212)) {
                            zM4486 = ViewOnAttachStateChangeListenerC2392.m4486(c4323);
                            enumC2459 = EnumC2459.f8214;
                            if (zM4486) {
                                c5819.m9630(C5464.f18016);
                                c0605 = c0606;
                                if (c0605.f2272 == enumC2459) {
                                    c5465 = C5464.f18020;
                                } else {
                                    c5465 = C5464.f18021;
                                }
                                c5819.m9630(c5465);
                            } else {
                                c0605 = c0606;
                            }
                            if (ViewOnAttachStateChangeListenerC2392.m4481(c4323)) {
                                c5819.m9630(C5464.f18022);
                                if (c0605.f2272 == enumC2459) {
                                    c5464 = C5464.f18021;
                                } else {
                                    c5464 = C5464.f18020;
                                }
                                c5819.m9630(c5464);
                            }
                        }
                    }
                    c4324 = (C4323) AbstractC4009.m7178(c2544, AbstractC2771.f9209);
                    if (c4324 != null) {
                        objM60222 = c31212.m5769().f8490.m6027(AbstractC2771.f9201);
                        if (objM60222 == null) {
                            objM60222 = null;
                        }
                        if (objM60222 == null) {
                            objM60223 = c31212.m5769().f8490.m6027(AbstractC2771.f9200);
                            if (objM60223 == null) {
                                objM60223 = null;
                            }
                            if (objM60223 == null) {
                                c5819.m9632("android.widget.ScrollView");
                            }
                        }
                        if (((Number) c4324.f14289.mo449()).floatValue() > 0.0f) {
                            accessibilityNodeInfo3.setScrollable(true);
                        }
                        if (AbstractC1605.m3367(c31212)) {
                            if (ViewOnAttachStateChangeListenerC2392.m4486(c4324)) {
                                c5819.m9630(C5464.f18016);
                                c5819.m9630(C5464.f18019);
                            }
                            if (ViewOnAttachStateChangeListenerC2392.m4481(c4324)) {
                                c5819.m9630(C5464.f18022);
                                c5819.m9630(C5464.f18017);
                            }
                        }
                    }
                    i9 = Build.VERSION.SDK_INT;
                    if (i9 >= 29) {
                        AbstractC5378.m9035(c5819, c31212);
                    }
                    charSequence = (CharSequence) AbstractC4009.m7178(c2544, AbstractC2771.f9216);
                    if (i9 >= 28) {
                        accessibilityNodeInfo3.setPaneTitle(charSequence);
                    } else {
                        accessibilityNodeInfo3.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
                    }
                    if (AbstractC1605.m3367(c31212)) {
                        c00711 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f769);
                        if (c00711 != null) {
                            c5819.m9630(new C5464(262144, c00711.f14721));
                        }
                        c00712 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f781);
                        if (c00712 != null) {
                            c5819.m9630(new C5464(524288, c00712.f14721));
                        }
                        c00713 = (C0078) AbstractC4009.m7178(c2544, AbstractC0208.f786);
                        if (c00713 != null) {
                            c5819.m9630(new C5464(1048576, c00713.f14721));
                        }
                        c30511 = AbstractC0208.f780;
                        if (c3264.m6015(c30511)) {
                            list2 = (List) c2544.m4771(c30511);
                            size5 = list2.size();
                            c4523 = ViewOnAttachStateChangeListenerC2392.f7926;
                            if (size5 < c4523.f14948) {
                                C1078.m2276(AbstractC3761.m6630(c4523.f14948, " custom actions for one widget", new StringBuilder("Can't have more than ")));
                                return null;
                            }
                            C1870 c1876 = new C1870(0);
                            C1254 c1254M1476 = AbstractC0664.m1473();
                            c1872 = c1871;
                            if (AbstractC2164.m4217(c1872.f6215, i7, c1872.f6217) >= 0) {
                                iArr = c4523.f14949;
                                i10 = c4523.f14948;
                                iArrCopyOf = new int[16];
                                i11 = 0;
                                i12 = 0;
                                while (i11 < i10) {
                                    int i319 = iArr[i11];
                                    int i49 = i10;
                                    i13 = i12 + 1;
                                    int i410 = i11;
                                    if (iArrCopyOf.length < i13) {
                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i13, (iArrCopyOf.length * 3) / 2));
                                    }
                                    iArrCopyOf[i12] = i319;
                                    i11 = i410 + 1;
                                    i12 = i13;
                                    i10 = i49;
                                }
                                arrayList3 = new ArrayList();
                                if (list2.size() <= 0) {
                                    AbstractC2049.m4001(list2.get(0));
                                    throw null;
                                }
                                if (arrayList3.size() > 0) {
                                    AbstractC2049.m4001(arrayList3.get(0));
                                    if (i12 > 0) {
                                        int i411 = iArrCopyOf[0];
                                        throw null;
                                    }
                                    AbstractC2552.m4812("Index must be between 0 and size");
                                    throw null;
                                }
                            } else if (list2.size() > 0) {
                                AbstractC2049.m4001(list2.get(0));
                                c4523.m7840(0);
                                throw null;
                            }
                            viewOnAttachStateChangeListenerC2392.f7942.m3722(i7, c1876);
                            c1872.m3722(i7, c1254M1476);
                        }
                    }
                    zM3362 = AbstractC1605.m3362(c31212, resources);
                    if (Build.VERSION.SDK_INT >= 28) {
                        accessibilityNodeInfo3.setScreenReaderFocusable(zM3362);
                    } else {
                        c5819.m9628(1, zM3362);
                    }
                    iM8891 = viewOnAttachStateChangeListenerC2392.f7937.m8891(i7);
                    if (iM8891 != -1) {
                        abstractC2535M70310 = AbstractC3925.m7039(viewTreeObserverOnGlobalLayoutListenerC0851.getAndroidViewsHandler$ui(), iM8891);
                        if (abstractC2535M70310 != null) {
                            accessibilityNodeInfo3.setTraversalBefore(abstractC2535M70310);
                            viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                            accessibilityNodeInfo3.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC0850, iM8891);
                        }
                        bundle = null;
                        viewOnAttachStateChangeListenerC2392.m4490(i7, c5819, viewOnAttachStateChangeListenerC2392.f7945, null);
                    } else {
                        bundle = null;
                        viewTreeObserverOnGlobalLayoutListenerC0850 = viewTreeObserverOnGlobalLayoutListenerC0851;
                    }
                    iM8892 = viewOnAttachStateChangeListenerC2392.f7939.m8891(i7);
                    if (iM8892 != -1) {
                        accessibilityNodeInfo3.setTraversalAfter(abstractC2535M7039);
                        viewOnAttachStateChangeListenerC2392.m4490(i7, c5819, viewOnAttachStateChangeListenerC2392.f7950, bundle);
                    }
                    str3 = (String) AbstractC4009.m7178(c2544, AbstractC5685.f18688);
                    if (str3 != null) {
                        c5819.m9632(str3);
                    }
                    c58110 = c5819;
                } else {
                    viewOnAttachStateChangeListenerC2392 = viewOnAttachStateChangeListenerC2393;
                    i7 = i;
                    c58110 = null;
                }
            }
        }
        if (viewOnAttachStateChangeListenerC2392.f7932) {
            if (i7 == viewOnAttachStateChangeListenerC2392.f7938) {
                viewOnAttachStateChangeListenerC2392.f7927 = c58110;
            }
            if (i7 == viewOnAttachStateChangeListenerC2392.f7929) {
                viewOnAttachStateChangeListenerC2392.f7948 = c58110;
            }
        }
        return c58110;
    }
}
