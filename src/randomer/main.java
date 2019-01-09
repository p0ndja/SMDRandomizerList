package randomer;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import randomer.RandomThread;

import javax.swing.JTextArea;

public class main {

	private JFrame frame;
	public static JTextArea textField;
	public static JLabel a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 18, 1234, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton name = new JButton("Random!");
		name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xxx();
			}
		});
		name.setFont(new Font("Tahoma", Font.ITALIC, 16));
		name.setBounds(548, 63, 113, 22);
		// name.setBackground(null);
		// name.setBorder(null);
		frame.getContentPane().add(name);

		textField = new JTextArea(10, 20);
		textField.setFont(new Font("Monospaced", Font.PLAIN, 11));
		textField.setText(
				"not_understands, gus_ss_13, _reverze_, phitpim281, juuuuu_ux, _keilnari, waitmanan, e.r.y_nichapattt, kratuay_, big.srrrx, sukrita_grace, pasin.atae_pv02, ploy.elf, kkkkungkaew, kdn._ong, terng_touterng, thithawatchaikree, yok_chayanit, _cake.cc_, ppyw_srr, biw_fq, sjadhks, ruby_boda_dah_, kunakronbell, bb_24nch, barnaby_masrani, b.suwichak_6, subtchz, wmoozji, tlee_lost, kfahmui, panda_ppt, m.jirannnnnnnn, paphawin_2002, non_naraphu, __yyookk, cherrrrrrp, ohns_smd, paopao.jidapa, pdao_kkn, anos_posidos, p0ndja_, ffocuszp, dome_kuku, piinky1432, tal_siwa, anxpcp, mxnd_mxnt, sithakonyai, anpanfilms, univenbars, apichapwat, _sskp, m_a_r_k99, keng_rattpol, pixeliology, _guitar_bantita, 401smd37, myamyss.pv, _madmeerpp, whatisneodoingtoday, p.khwunjira, schayatang, m1class3, phirada_tte.vongola_tte, ominjunz, adale_ks, kaotung1307, onpreeya_jeff.pv, ttu_tta, __tumu, earthhhtnp, noeynpk_, th_buawie, studygram.en, foamyanisa, supper_plao05, m.mintttttt, _nithiyada.p, pond_sapungra, anye.ls, pruekpatchara, kantapong_numam, petch_rojaroen, p0ndja, achira_artnaseaw, ananya_khumsiri, gamie_lll, _nattha_kanya_, thidsawan_tonkaow, ks_save, anuchitsakhwa, mind_pyp, at_skyrider, tantirungpkrn, ton_sunti_, dave614001, mozzarellatot, klong.supawich, jame_skr, boonyita__pam, n_noodee_e, mr.killz5678, ppat_payara, sigmaaaaaa, janedekaer, _nt.pploy_, maihaifollesus, olives_sirikwan, pha.de.r, thammuxx.wo, skypurim, t_baifernnn, jeebmaidaitamrhanpen, thirac3on.79, ai.jiyarkon9, suphapirun, 01_hctep, dramasu.viiis, pp.kamonwan, vr_zfig, ming.samatra, _n.a.m.t.a.n, wasin_kitpongpraphan, wirulhaitrkhummadan, a_piwit_, ttaann_namtan, akkarawat13, aaofpanomwat, pac_blaaa, gidrock11, anda_how2play, phakhinp.phuangrak, n_tubtim2005, aimiiiiiiiiiiiiiiiiiiiiiiiiiii, ptpsixfeetdeep, chacree_nemo, _knp_p, _pimchanok.p, tammaitonggu_m22, chonlachat__sepsuk, chobmakleoynaja, mz_mookk, jacky2546_smd37, ann_palasarn, nong__bell_, zzonn46, not.kongkiat, kuy_tangmo, proud9949, sugar_ntkm, pimkanokpat, nana_nachcha, bt_bt_17246, warunya_miw, p.pimma, jj.jiji, my_amyss, m42memories, bovyyepi, m.naphat, boat_wchp, kusael_, memee.dedee49, aew.tng, 501smd36, dadathanyarat, p2ea_2nd, pacharee_dechhamat, _tgarnadex, nine_phumikan, farro_sarunpat, bharinthon.pure, lo.__.tus_hi, jinjutha_fah, idea_p, thisis_bbbxxu, kun4490, nnayanesz, tee_rp, pobie_, 2tongneverdie5, kong.chy, mookjear, ananyakhumsiri, buk_fast, ppandz___, cpongdanai.sr, meawfibi, ioon.ktl, _.sayp._ii, icantfindmybrain, sk_tt_, deardt, moji1o_, zo_rimm, pibpam_, hathpatt, patchaphornsripara, nathchnnthmaathawngs, fer_kuppom, zyuan104, btbdt.qle, kzheo_msun, pocky_pk_pocss, me_knkwanja, arttatip, guide5541, _nt.pploy, shxxzi21, leothanakrit, yoryada, naiyathemermaid, kanokphit_promnee, pmaniwara, mmonpichaa, oat_supasin_oat, jaosua__nadon, fxshr_, pxnpun, ume_ksis, daw_kdd, bantita_guitar, p_e_t_c_h_18, kittiruk_, madiawmd, kua_gi_kook, piksupanida, photonishandsome, punpunnatthanan, pearwa_ptpa, tdwaadhk, big.bear.55, giftbarukbaruk, isareetrong, nikhaaoi, baekho_2547, jaa_supat_t, on.3638_on, a.ng.p.ao_, parnnn_skt, kumiga_hanamiya, __npsmay, naruechon_ja, o_m.minba, rhatchai, ploypcych, pws_wind, vita.a_1317, kuy.earnz, best_piyawat77, yctmx_, nueng_38, yanisa_treesoon, pn_nammmm, n.rattanapor_n, nam_spice, tattooonine, j.aonai_ps, tong_chichey, phoom00978, peerapatnoiha, memee_sayonara, tonkaojtk, sakdisiththihasminthr, bam_smd, kwan_smd_40, t_phakasorn, pam_boonyita, ppleumppsr, komgritmui, pnt_beam, pawatkul, naruefern, ter_windin4_1, chin__pk, filmgg2012, cht_punkk, pk.kim38, tor_pavanoot, ntc.pam29_38, kk_kongyy, l3ook_.__, goyasirikarn.t, fusemee, drowsy_p, geeeee_ex, sand_and_the_sai, fiizizgo, bell_eiei48, _nicole__________________, cceumcc, itsawanuwat, bearitoee, kungongpaimodla_55, phwnchl, _mintfish, tonwan__15, _ponokaynak, worapat_nine.ny, winniethebeau, te_tetette, model_tanapat, smcww, irhythm_, 01thehacker39, etrnt_, khaow_faang, thespyy_, pv_mimiew, praewpchx, yuyyuy468, kittiyakorn___, mk.srywnn_vc, thammux_, soravich_ahhh, mui_model_moji, latelenovosoloopposumosamsung, jaseexs, __chonchuda__, baitoei_pkl, yanikor_n_namkhing, pichayapazz, puen_spks, thitapa.kwang, don_rebound, kan.sw, pimptc_, sssssaimai_, nam__________48, petchate2549, ggunw, k.kunlanan.n, ptwpunch, gnaffx, mailmtcq, b.palmmy, pannawich_pond, _dungoz, abg_pednoy, prem_pitakpong, p_clloud, pin.kanchanok, natenalat, kkpeanutsallergic, view_ptch, panpan_cth, koonming_j, som.army, jj.jjvrcy, sutineesriraksa, pasin.atae, pwersthaphchaay, d.melodream, ploy_and_smd40, mmew_mmp, topz_slotz, pigpigworlddd, pskrn.so, jiratxp, erngree, tanya_bam19, erpaintz_, galm_kalm, pphuchit_, n__nukaewji, faleemfilm, oporsrtc_, ploy_najaaaaa, dreamerrrr.r, eve_pimphitcha, ioon_sb, sugiyummy, nununtaze, ccmewch, 150324xyx, byr_tnnm, potaeheartsofer, _fxsxi_, pf_stch_48, x_natthawat17_x, mny__meme, aquaaland_, fon_stta, teammicza09, ppam_cnk, pjmp.ta, kaimaihereraohere, beembbx, oh_sebeam, nattawat_oshimo, yaomingbb, boat.cha, ice_nx, bnkm_93, s.sutidaaomm, kaewxs, kunsmd2547, __mook19__, hammy_tnp, n.nncpd, tan_taan__, lovelyhappy_y, nene_nakaa2002, chayanan_jj_iamsamang, bboonnisa, ppdaxjk, hngsaawisnusrrs, n.ut.thi.da.oom, bea_with_bua, dapp_hyungseok, ivvnpt, apichay.a, _mmtrxx, organ.natthathida, _llara_krista_nicejijung, mkanyapak, canlfc, k_t.pert, gaew_gaewalin, nxpzr, __manunya.jan__, pinbowl_rmd, j.jaiii, s_noramon, touchz_festival, ppieyu._, pui_popular, s.ketch_g, helloitsmeceetubharrrrrr, ppnmiew, tonnam__tonnam, kpj_0203, pyp.nam, tanatchon_bodyslam_fc, ggxstsrc, mew3628, tawan.jpg, rasita_joy, jhkypmbhin__, atiht.sp, dffrntl, yawcha, sky_solar_45, in_intprn, kateozap, ying.prc, natnicha_mn, iii_ice_, raxhw_, p_double.e, tanapat.peem, delay_man, w.ploy.w");
		textField.setWrapStyleWord(true);
		textField.setLineWrap(true);
		textField.setBounds(10, 86, 1198, 564);
		frame.getContentPane().add(textField);

		a = new JLabel("");
		a.setFont(new Font("Tahoma", Font.BOLD, 29));
		a.setHorizontalAlignment(SwingConstants.CENTER);
		a.setBounds(10, 11, 1198, 41);
		frame.getContentPane().add(a);
	}

	public void xxx() {
		RandomThread thread = new RandomThread(this);
		thread.isRunning = true;
	}
}
